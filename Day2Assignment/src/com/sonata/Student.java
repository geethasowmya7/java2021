package com.sonata;
public class Student {
	String StName;
	int StId;
	int StClass;



	// constructor
	Student(String n, int a) {
	StName = n;
	StId= a;
	}



	void printDetails() {
	System.out.println("My name is " + StName + " and my Id is " + StId);
	}
	}



	