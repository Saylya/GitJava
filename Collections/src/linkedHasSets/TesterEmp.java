package linkedHasSets;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
/*create 5 fixed size list of emp
 * use suitable data structure to sort these emp details as per id
 * ie. use asList, comparable ,natural ordering
 */
public class TesterEmp {
public static void main(String[] args) {
	List<Emp> emps= Arrays.asList(new Emp(101,"abc3","rnd",12345),
			(new Emp(10,"abc4","hr",12245)),
		    (new Emp(45,"abc2","rnd",13445)),
			(new Emp(67,"abc1","rnd",22345)),
			(new Emp(14,"ab13","prd",15645)));
	
	TreeSet<Emp> empSet= new TreeSet<>(emps);
	//natural ordering
	System.out.println("employee sorted as per id");
	for(Emp e:empSet)
		System.out.println(e);
											
}
}
