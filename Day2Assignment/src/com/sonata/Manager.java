package com.sonata;

public class Manager extends Employee{
	Manager(){
	}
	Manager(int a ,String n,double s) {
		super(a,n,s);
	}
	public void SalCal() {
		super.SalCal();
		double ta=empSal*0.30;	
		System.out.println("ta is:"+ta);
	
	 }
	
	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.empId=100;
		m1.empName="Mukunda";
		m1.empSal=50000;
		m1.SalCal();
		m1.display();

	}



	

}
