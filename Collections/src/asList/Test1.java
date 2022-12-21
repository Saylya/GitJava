package asList;

import java.util.Arrays;
import java.util.List;
//asList is used to create fixed size list
public class Test1 {
public static void main(String[] args) {
	//three types to give arguments to asList method
	List<Integer> intList= Arrays.asList(new Integer[] {1,2,3,4});//1
System.out.println(intList);
 intList=Arrays.asList(10,20,1,34,45,100,10);//2
 System.out.println(intList);
 intList=Arrays.asList(new Integer[] {});//3
 System.out.println(intList);

 intList.add(9999);//for grow able linked list we can use add method but asList method returns fixed size array so add method will throw runtime error
 System.out.println(intList);//runtime error :UnsupportedOperationException
intList.remove(0);
System.out.println();//runtime error :UnsupportedOperationException as we cannot change length of this link
intList.set(0, 33);
System.out.println(intList);//no runtime error as we are just replacing the element not changing size
}
}
