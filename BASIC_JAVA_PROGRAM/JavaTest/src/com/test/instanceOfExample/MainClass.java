package com.test.instanceOfExample;

public class MainClass {

	public static void main(String[] args) {
		Object student= new Student();
		Student student2= new Student();
		I i= new Student();
		/*
		 * instanceOf is used to check the object of the class that means that object
		 * belongs to that class or not
		 */
		System.out.println(student instanceof Student);
		System.out.println(student2 instanceof Student);
		System.out.println(i instanceof Student);
		
		A a= new A();
		B b= new B();
		
		A b1= new B();
		

	}

}
