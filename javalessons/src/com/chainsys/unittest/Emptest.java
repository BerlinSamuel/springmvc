package com.chainsys.unittest;
import com.chainsys.classandmethods.Employee;
public class Emptest {
	public static void testEmpName() {
		Employee firstEmployee= new Employee(1234);
	firstEmployee.setName("Berlin");
	System.out.println(firstEmployee.getName());
	}
	public static void testCity() {
		Employee firstEmployee= new Employee(1234);
		firstEmployee.setCity("Madurai");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary() {
		Employee firstEmployee= new Employee(1234);
		firstEmployee.setSalary(60000);
		System.out.println(firstEmployee.getSalary());
	}
}