package com.app.core;
import java.util.ArrayList;
import static java.time.LocalDate.parse;

public class Collection_utils {
//write a static method to return populated list of emps
	public static ArrayList<Emp> populateSampleList(){
		ArrayList<Emp> empList= new ArrayList<>();
		empList.add( new Emp(101,"abdc","rnd",20000,parse("2020-01-01")));
		empList.add( new Emp(10,"abd5","production",17000,parse("2029-01-01")));
		empList.add( new Emp(67,"abd1","rnd",25000,parse("2020-11-05")));
		empList.add( new Emp(50,"abd6","hr",29000,parse("2017-01-01")));
		empList.add( new Emp(13,"abd3","rnd",56000,parse("2011-01-21")));
		empList.add( new Emp(45,"abd4","hr",19000,parse("2011-01-21")));
       return empList;//collection_utils class is returning reference of the populated ArrayList to the caller, so we are returning ref
       
	}
}
