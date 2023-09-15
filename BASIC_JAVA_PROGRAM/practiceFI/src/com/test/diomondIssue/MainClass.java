package com.test.diomondIssue;

interface I {
	default void m1() {
		System.out.println("inside I inteface");
	}
}

interface I1 {
	default void m1() {
		System.out.println("inside I1 inteface");
	}
}
class Abc implements I,I1{

	@Override
	public void m1() {
		I1.super.m1();
	}
	
}

class A{
	public void m2(int x) {
	System.out.println(x);	
	}
}
class B {
	public void m2(String x) {
	System.out.println(x);	
	}
}


public class MainClass{

	public static void main(String[] args) {
		//new Abc().m1();
		new A().m2(5);

	}

}
