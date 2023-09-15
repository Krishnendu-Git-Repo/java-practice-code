package com.test.fifthday.abstractexample;

public abstract class ExampleAbstract {
	abstract void m1();
	public void m2() {
		System.out.println("non abstract method");
	}
}
abstract class Example extends ExampleAbstract{
	
}
class AbstractImpl extends ExampleAbstract{

	@Override
	void m1() {
		System.out.println("method is override");
		
	}
	
}
