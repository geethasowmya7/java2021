package com.sonata;

public class Shape  implements Shapeinterface {
	Shape(){}
	@Override
	public String Shapes(String val) {
		// TODO Auto-generated method stub
		return val;
	}

	

	public static void main(String[] args) {
		new Shape(){};
		Shape s1=new Shape();
		Shape s2=new Shape();
		Shape s3=new Shape();
		
		
	
		System.out.println(s1.Shapes("traingle"));
		System.out.println(s2.Shapes("square"));
		System.out.println(s3.Shapes("circle"));
		
	}
}





}
