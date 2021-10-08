package com.sonata;

public class Employee {
	int empId;
	String empName;
	double empSal;
	Employee(){}
	Employee(int id ,String name,double sal){
		this.empId=id;
		this.empName=name;
		this.empSal=sal;
	}
	
	public void salCal() {
		System.out.println("Salary:");
		
	}
    public void display() {
    	System.out.println("");
		System.out.println("id:"+empId);
		System.out.println("name:"+empName);
		System.out.println("sal:"+empSal);
	}

}


