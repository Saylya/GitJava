package sets;
import java.util.HashSet;

public class EmpSet2 {

	public static void main(String[] args) {
		// create hash set to store employee details
		HashSet<Emp> empSet= new HashSet<>();
		Emp e1= new Emp(101,"abc","rnd",10000);
		Emp e2= new Emp(10,"abc2","rnd",10000);
		Emp e3= new Emp(50,"ab3","rnd",10000);
		Emp e4= new Emp(34,"abc4","rnd",10000);
		Emp e5= new Emp(101,"abc","rnd",10000);
System.out.println("added "+empSet.add(e1));//true
System.out.println("added "+empSet.add(e2));//true
System.out.println("added "+empSet.add(e3));//true
System.out.println("added "+empSet.add(e4));//true
System.out.println("added "+empSet.add(e5));//false as it is a duplicate element
System.out.println("Emp details");
for (Emp e:empSet)
	System.out.println(e);//duplicates will be seen
	//	System.out.println(e1.equals(e2));//true before overriding hashcode()
		//System.out.println(e1.hashCode()+" "+e2.hashCode());//different before overriding hashcode()
		
	}

}
