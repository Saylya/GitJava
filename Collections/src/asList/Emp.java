package asList;

public class Emp implements Comparable<Emp>{
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
//getters for anonymous inner class
@Override
public int hashCode() {
	System.out.println("In hashcode");
	return id;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getDeptId() {
	return deptId;
}
public double getSalary() {
	return salary;
}
@Override
public int compareTo(Emp otherEmp) {
	return((Integer)id).compareTo(otherEmp.id);//to compare as per id
//up casting to wrapper class because we have to compare id to objects of employee class
}
}
