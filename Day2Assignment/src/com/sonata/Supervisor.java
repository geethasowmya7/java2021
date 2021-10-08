package com.sonata;

public class Supervisor  xtends Employee
private int empSal;
private String empName;
private int empId; {}
	Supervisor(){	}
	Supervisor(int a ,String n,double s) {}
	
	 public void SalCal() {
		 int hra = empSal/2;
		 double da = empSal*0.2;
	 }
		

	public static void main(String[] args) {
		Supervisor s1=new Supervisor();
		s1.empId=200;
		s1.empName="Sri";
		s1.empSal=40000;
		s1.SalCal();
		s1.display();
	}
	private void display() {
		// TODO Auto-generated method stub
		
	}
	
}
		

	


