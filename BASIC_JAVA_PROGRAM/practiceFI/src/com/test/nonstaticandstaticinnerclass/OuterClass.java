package com.test.nonstaticandstaticinnerclass;

public class OuterClass {
	public String name="Krishnendu";
	private Integer roll =10;
	public static String address ="Kolkata";
	
	public void m1() {
		System.out.println("method m1 that is non static of outer class");
	}
	private void m2() {
		System.out.println("method m2 that is non static outer class");
	}
	public static void m3() {
		System.out.println("method m3 that is static outer class");
	}
	
	class NonStaticInnerClass {
		public void m4() {
			System.out.println(name);
			System.out.println(roll);
			System.out.println(address);
			m1();
			m2();
			m3();
			System.out.println("method m4 that is non static of Non Static Inner class");
		}	
	}
	static class StaticInnerClass {
		public void m5() {
			System.out.println(address);
			m3();
			System.out.println("method m5 that is non static of  Static Inner class");
		}
	}

}
