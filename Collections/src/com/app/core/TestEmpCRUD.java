package com.app.core;
import java.util.Scanner;

import sorting.EmpJoinDateComparator;

import java.util.ArrayList;
import static java.time.LocalDate.parse;
import java.util.Collections;
//import static java.util.Collections.sort;
import java.util.Comparator;
import java.time.LocalDate;

import static com.app.core.Collection_utils.populateSampleList;

public class TestEmpCRUD{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			ArrayList<Emp> emps= populateSampleList();
			boolean exit=false;//exit flag
			while(!exit) {
				System.out.println("Options: 1.Hire employee 2.Display all employee details 3.link adhar card 4.find by date 5.sort emps as per emp id 6.sort employees as per join date 7.sort emps as per asc order join date and salary  10.exit");
			try {
				switch(sc.nextInt()) {
				case 1:System.out.println("enter employee details: id,name, deptno, salary,join date(yyyy-MM-dd");
				Emp e= new Emp(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),parse(sc.next()));
	
	emps.add(e);
				break;
				
				case 2:
					System.out.println("emp details");
					for (Emp e1:emps)
						System.out.println(e1);
					break;
				case 3:// Association in form of aggregation met
					System.out.println("For Linking Adhar card enter :emp id");
					e= new Emp(sc.nextInt());
					int index=emps.indexOf(e);
					if (index==-1)
						throw new EmpHandlingException("Linking card failed:Invalid emp id");
					//==> invalid emp id
					System.out.println("enter adhar card details:card no,location");
					emps.get(index).linkAdharCard(sc.next(), sc.next());
					System.out.println("Adhar linked sccessfully");
					break;
				case 4:
					//display names of emps , joined after specific date
					System.out.println("Enter a specific date (yyyy-MM-dd)");
					LocalDate date= parse(sc.next());
					System.out.println("Name of the emps joined after"+date);
					for( Emp e2:emps)
						if(e2.getJoindate().isAfter(date))
				System.out.println(e2.getName());
					break;
				case 5://sort emps as per asc order of emp id
					//no need to give any input as we already have the list
					Collections.sort(emps);//java c always goes by ref that is emps:AL ISA list, generic type of list is Emp, Emp is not extending Comparable i/f
					//so we have implemented comparable to Emp so now Emp ISA comparable so javac error gone	
					//this will automatically call emp classe's compareTo method
					break;
					
				case 6://sort employees as per join date, there is ready made api
					Collections.sort(emps, new EmpJoinDateComparator());
					//compare will be called automatically
					break;
				case 7://sort as per salary and join date using anonymous inner class
					Collections.sort(emps,new Comparator<Emp>() {
						@Override
						public int compare(Emp e1, Emp e2) {
							System.out.println("in comapre:anonymous inner clas");
							//date
							int retValue=e1.getJoindate().compareTo(e2.getJoindate());
							if (retValue!=0)
                               return retValue;
							//if join date is same sort on salary
							return ((Double)e1.getSalary()).compareTo(e2.getSalary());
						}
					});
				case 10:
				exit=true;
				break;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
		}
	}
}
			
