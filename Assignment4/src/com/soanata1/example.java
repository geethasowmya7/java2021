package com.soanata1;

public class example {
	public class Example {
		   public static void main(String[] args) {
		      List<Student> studentlist = new ArrayList<Student>();
		      studentlist.add(new Student("Jon", 22, 1001)); 
		      studentlist.add(new Student("Steve", 19, 1003)); 
		      studentlist.add(new Student("Kevin", 23, 1005)); 
		      studentlist.add(new Student("Ron", 20, 1010)); 
		      studentlist.add(new Student("Lucy", 18, 1111));
		      System.out.println("Before Sorting the student data:"); 
		 
		      studentlist.forEach((s)->System.out.println(s));

		      System.out.println("After Sorting the student data by Age:"); 

		      studentlist.sort((Student s1, Student s2)->s1.getAge()-s2.getAge()); 

		      studentlist.forEach((s)->System.out.println(s));         

		      System.out.println("After Sorting the student data by Name:"); 
		      studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName())); 
		      studentlist.forEach((s)->System.out.println(s));        
		      System.out.println("After Sorting the student data by Id:");        
		      studentlist.sort((Student s1, Student s2)->s1.getId()-s2.getId()); 
		      studentlist.forEach((s)->System.out.println(s)); 
		   }
		}

}
