package com.sonata;

public class Manager extends Employee implements EmployeeInterface{
	Manager(){}
	Manager(int id,String name,double sal){
		super(id,name,sal);
	}
	
	@Override
	public void salCal() {
		System.out.println("Manager salary:"+empSal);
	}

	@Override
	public void display() {
		System.out.println("manager details");
		System.out.println("id:"+empId);
		System.out.println("name:"+empName);
		System.out.println("sal:"+empSal);
		System.out.println("");
		
		
	}

}

