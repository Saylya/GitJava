package sets;
import java.util.HashSet;
import java.util.Iterator;
public class StringSet {

	public static void main(String[] args) {
		String []strings= {"xyz","abc123","pqr34","turty","bay","chips","xyz","bay"};
		//create empty Hash set to store strings
		HashSet<String> stringSet= new HashSet<>();//initial capacity is 16, load factor-0.75, size=0
		for (String s:strings)
			System.out.println("Added"+stringSet.add(s));//returns true/ false as per presence of element also adds specified element to set if it is not present
		
		System.out.println("HS added"+stringSet);//no duplicates, un-ordered, un sorted
		System.out.println("HS size"+stringSet.size());//6
	//display all strings 
		for (String s:stringSet)
			System.out.println(s.toUpperCase());
		//remove all the elem from string set having string legth>3
		Iterator<String> itr=stringSet.iterator();
		while (itr.hasNext())
			if(itr.next().length()>5)
				itr.remove();
		System.out.println("hs contents after remove"+stringSet);
	//print present or absent if element is found or not found
	System.out.println("Hs contains 'bay'"+stringSet.contains("bay"));//true
	
	
	}

}
