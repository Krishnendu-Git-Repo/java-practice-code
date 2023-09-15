package com.test.fifthday.functionalinterface;

interface Inter{
	public void methoddd();
	//public void methoddd1();
}
@FunctionalInterface
public interface I extends Inter {
//public void m();
}
interface I1 extends I {
	public void m1();
}


interface Marker{
	
}
interface M2 extends Marker {
	
}


interface Test{
	void t();
	void t1();
}
interface Test1 extends Test {
	
}

interface Example{
	public static void t1() {
		System.out.println("static method");
	}
	default void t2() {
		System.out.println("default method");
	}
}
class A implements Example{
	
}
