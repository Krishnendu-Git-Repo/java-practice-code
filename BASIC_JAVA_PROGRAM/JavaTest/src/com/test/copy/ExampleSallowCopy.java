package com.test.copy;

public class ExampleSallowCopy {
	int x = 30; 
}


class A {
	public A() {
		this(5, 10);
		System.out.println("default");
	}

	public A(int a, int b) {
		System.out.println("parameter");
	}
}

class B extends A {
	public B() {
		this(true, true);
		System.out.println("B default");
	}

	public B(boolean a, boolean b) {
		super();
		System.out.println("B parameter");
	}
}

class Test {
	public Test(int x) {
		System.out.println(x);
		x=4;
		System.out.println(x);
	}
}

class X {
	public X() {
		System.out.println("xxxxxx");
	}
}
class Y extends X {
	public Y() {
		System.out.println("yyyyyy");
	}
}
class Z extends Y {
	public Z() {
	System.out.println("zzzzzz");	 
	}
}

