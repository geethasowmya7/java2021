package com.sonata;

public class Employee {
	 int empId;
	 String empName;
	 double empSal;
	 double hra,da,ta;
	  Employee(){}
	  
	Employee(int id,String name,double sal){
		 this.empId=id;
		  this.empName=name;
		  this.empSal=sal;
	}

	 public void SalCal() {
		 hra=empSal/2;
		 da=empSal*0.20;

		
		 
	 }
	 public void display() {
		 System.out.println("hra is:"+hra);
		 System.out.println("da is:"+da);
		 
		 //System.out.println("ta is:"+ta);
		// System.out.print("total salary (empSal+hra+da+ta):"+empSal+"+"+hra+"+"+da+"+"+ta+"="+(empSal+hra+da+ta));
	 }
	 

}
