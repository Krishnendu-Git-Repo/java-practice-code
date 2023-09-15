package com.test.thirdday.blockexecutation;

public class Test {
	public Test() {
		System.out.println("Constructor");
	}

	public void demo() {
		System.out.println("instance method");
	}

	public static int x = 10;

	static void m1() {
		String str = "krishnendu";
		System.out.println(str);
		System.out.println("static method m1");
	}

	public static void main(String[] args) {
		System.out.println(x);
		System.out.println("static main method");
		Test test = new Test();
		test.demo();
	}

	/*
	 * first execute the static block. After static block the static method is
	 * executed. Then static variable will execute. Then constructor will execute.
	 * Then instance method is execute, if all are present in side one class.
	 */
	static {
		int y = 25;
		System.out.println("static block");
		m1();
		System.out.println(y);
	}

}
