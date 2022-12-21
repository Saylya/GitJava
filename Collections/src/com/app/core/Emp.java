package com.app.core;
import java.time.LocalDate;

public class Emp implements Comparable<Emp>{
private int id;
private String name,deptID;
private double Salary;
private LocalDate joindate;
private AdharCard card;//it will hold address of reference of other object created separately on heap

public Emp(int id, String name, String deptID, double salary, LocalDate joindate) {
	super();
	this.id = id;
	this.name = name;
	this.deptID = deptID;
	Salary = salary;
	this.joindate = joindate;
}

@Override
public String toString() {
	StringBuilder sb=new StringBuilder();
	if(card!=null)
		sb.append(card);
	return "Emp [id=" + id + ", name=" + name + ", deptID=" + deptID + ", Salary=" + Salary + ", joindate=" + joindate
			+"Adhar Card details"+ card+sb;
}
//add a method to link Adhar card details to emp method should be non-static because you are linking adhar card instance to one employee not all employees as all employees will have diff adhar card
public void linkAdharCard(String cardNo, String location) {
	card= new AdharCard(cardNo,location);
}
@Override
public boolean equals(Object o) {//to tell JVM quality testing criteria
 if (o instanceof Emp)
	 return id==((Emp)o).id;
 return false;
}

public Emp(int id) {//to convert emp id in Emp type of reference
	super();
	this.id = id;
}

public LocalDate getJoindate() {
	return joindate;
}

public String getName() {
	return name;
}

@Override
public int compareTo(Emp e) {//sorting algorithm is calling this method implicitly so it will
	//sorting algorithm undestand only one sorting criteria so even after method overloading for sorting by another criteria, other methods won't be detected
	System.out.println("In compare to");
	//sorting criteria id based
	if(this.id<e.id)
		return -1;
	if(id==e.id)
	return 0;
	return 1;//or else will return 1 in case of id>e.id
}

public double getSalary() {
	return Salary;
}

}
