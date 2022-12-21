package sets;

public class Emp {
private int id;
private String name,deptId;
private double salary;

public Emp(int id, String name, String deptId, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.deptId = deptId;
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
}
@Override
public boolean equals(Object o) {
	System.out.println("in emp equals");
	if(o instanceof Emp)
	{
		Emp e=(Emp)o;
		return id==e.id;
	}
return false;
}

//for correct working for hashing based data structure :rule:equal objects must produce same hashcode
//un equal objects should produce distinct hash code to improve hash table performance

@Override
public int hashCode() {
	System.out.println("In hashcode");
	return id;
}
}
