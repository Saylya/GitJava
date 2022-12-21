package lists;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;

public class IntegerList2  {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner (System.in)){
		// create empty array list to store integer type of reference.
		ArrayList <Integer> list= new ArrayList<>();//
		//size:0, capacity:10
		int data []= {10,23,-67,123,10,23,45,55,12,1,23};
		//populate AL with data
		for (int i:data)//i= data[0]....... i=data[data.length-1]
			list.add(i);//add appends added elements in array, auto boxing: int-->Integer as collection framework supports only wrapper not primitve
		//display AL via toString
		System.out.println("Al via toString "+list);//when we call list it calls toString of
	 //enter an element to search
		System.out.println("enter an element to search");
		System.out.println(list.contains(sc.nextInt())? "Present":"Absent");
		System.out.println("Enter element");//print index of 1st and last occurrence
		int elem=sc.nextInt();
		System.out.println("1st occur"+list.indexOf(elem)+"last occur"+list.lastIndexOf(elem));
		//double values of the elements >50
		for(int i=0;i<list.size();i++)
			if(list.get(i)>50)// auto un boxing
				System.out.println("Replaced"+list.set(i, list.get(i)*2));
		System.out.println("AL via to String after doubling"+list);
		//remove odd elements from list
		//1st step attach iterator
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext())
			if(itr.next()%2!=0)
				itr.remove();
		System.out.println("List after removal:"+list);
		}catch (Exception e) {
e.printStackTrace();		 
	 }
	}
}
