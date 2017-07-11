package com.acadgild;

import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.setDesignation("Team_Lead");
		e1.setName("Ramesh");
		e1.setSalary(20000);
		
		e2.setDesignation("SSE");
		e2.setName("Mahesh");
		e2.setSalary(7000);
		
		e2.setDesignation("SE");
		e2.setName("John");
		e2.setSalary(1000);
		TreeSet<Employee> emp=new TreeSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
		

	}

}
