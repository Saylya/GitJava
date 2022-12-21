package sets;
import java.util.HashSet;

public class EmpSet {

	public static void main(String[] args) {
		// create hash set to store employee details
		HashSet<Emp> empSet= new HashSet<>();
		Emp e1= new Emp(101,"abc","rnd",10000);
		Emp e2= new Emp(101,"abc","rnd",10000);
		Emp e3= new Emp(101,"abc","rnd",10000);
System.out.println("added "+empSet.add(e1));//true
System.out.println("added "+empSet.add(e2));//true
System.out.println("added "+empSet.add(e3));//true
System.out.println("size"+empSet.size());
System.out.println("Emp details");
for (Emp e:empSet)
	System.out.println(e);//duplicates will be seen
		System.out.println(e1.equals(e2));//true before overriding hashcode()
		System.out.println(e1.hashCode()+" "+e2.hashCode());//different before overriding hashcode()
		
	}

}
