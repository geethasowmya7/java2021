package com.sonata;

public class Product {
	int productId;
	String productName;
	double productPrice;

	Product(int a,String b,double c){
	this.productId=a;
	this.productName=b;
	this.productPrice=c;
	}
	public void display(){
	System.out.println("proid:"+productId);
	System.out.println("proname:"+productName);
	productPrice=productPrice+(productPrice*0.19);
	System.out.println("pro price:"+productPrice);

	}
	public static void main(String args[]){
	Product p1=new Product(1,"doll",30000);
	Product p11=new Product(22,"car",40000);
	p1.display();
	p11.display();
	}
	}




