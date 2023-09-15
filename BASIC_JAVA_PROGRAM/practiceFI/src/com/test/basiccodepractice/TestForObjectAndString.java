package com.test.basiccodepractice;

public class TestForObjectAndString {

	public static void main(String[] args) {
		TestForObjectAndString t = new TestForObjectAndString();
		t.display(null);

	}
	public void display(String s){
		System.out.println("String");
		System.out.println(s);
	}

	public void display(Object o){
		System.out.println("Object");
		System.out.println(o);
	} 

}
