package asList;
//use suitable data structure to sort these emp details as per dept id and salary composite key as primary key
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class TesterEmp2 {
public static void main(String[] args) {
	List<Emp> emps= Arrays.asList(new Emp(101,"abc3","rnd",12345),
			(new Emp(10,"abc4","hr",12245)),
		    (new Emp(45,"abc2","rnd",13445)),
			(new Emp(67,"abc1","rnd",22345)),
			(new Emp(14,"ab13","prd",15645)));
	
	TreeSet<Emp> empSet= new TreeSet<>(new Comparator<Emp>() {
		//anonymous inner class with sorting criteria comparator<Emp>
		@Override
		public int compare(Emp e1, Emp e2)
		{
			System.out.println("in compare");
			int ret= e1.getDeptId().compareTo(e2.getDeptId());
			if(ret==0)
				return ((Double)e1.getSalary()).compareTo(e2.getSalary());
			return ret;
		}
	});
	//custom ordering
	System.out.println(empSet);//[] empty tree set as we have given only comparison criteria in anonymous inner class
	// now populate set
	empSet.addAll(emps);//anonymous inner's compare method will get called
	System.out.println("employee sorted as per dept id and salary");
	for(Emp e:empSet)
		System.out.println(e);
											
}
}
