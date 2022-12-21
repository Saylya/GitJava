package lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IntegerList  {

	public static void main(String[] args) {
		// create empty array list to store integer type of reference.
		ArrayList <Integer> list= new ArrayList<>();//
		//size:0, capacity:10
		int data []= {10,23,-67,123,10,23,45,55,12,1,23};
		//populate AL with data
		for (int i:data)//i= data[0]....... i=data[data.length-1]
			list.add(i);//add appends added elements in array, auto boxing: int-->Integer as collection framework supports only wrapper not primitve
		//display AL via toString
		System.out.println("Al via toString "+list);//when we call list it calls toString of
		//can you attach an iterator to AL?- YES
		Iterator<Integer> itr=list.iterator();//returns iterator, cursor position is before 1st element
       System.out.println("printing AL using iterator");
		while(itr.hasNext()) {
    	   System.out.print(itr.next()+" ");
    	   //System.out.println(itr.next());//will give NoSuchElementException
    	   //display AL elements in reverse order.
    	   //attach new ListIterator:position it after the last element
    	  System.out.println("Printing elements in reverse order");
    	   ListIterator<Integer> litr=list.listIterator(list.size());
    	   while(litr.hasPrevious())
    		   System.out.print(litr.previous()+" ");
    	   
	}
	}
}
