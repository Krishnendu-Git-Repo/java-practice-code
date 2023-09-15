package com.test.practiceofall;
class A{
public void m1() {
	System.out.println("Class A >>>>>>>>>>>>>>>>");
}
}
class B extends A{
	
	public void m1() {
		System.out.println("Class B >>>>>>>>>>>>>>>>");	
	}
	public void m2() {
		System.out.println("Class BB >>>>>>>>>>>>>>>>");	
	}
}
public class TestInterface {

	public static void main(String[] args) {
	A a = new B();
	a.m1();
	//new B().m2();

	}

}
