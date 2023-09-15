package com.test.basiccodepractice;

public class ClassAndInterfaceConcept {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		Test1 a=new Test1();
		new Test1().m1();
		new Test1().m2();

	}

}

class Test1 extends ClassAndInterfaceConcept implements I {
	public void m1() {
		System.out.println(x);
	}

	
	

}

interface I {
	Integer x = 10;
	default void m2() {
		System.out.println(x);
	}
}
