package com.test.generics;


public class MainClass {
public static void main(String[] args) {
	GenericClass<String> genericClass= new GenericClass<String>("ABC");
	System.out.println(genericClass.x);
	
	Integer[] integerArray= {5,10,15,20,25};
	String[] stringArray= {"Shantanu","Krishnendu","Riya"};
	Generic generic= new Generic();
	generic.printArray(integerArray);
	
}
}
