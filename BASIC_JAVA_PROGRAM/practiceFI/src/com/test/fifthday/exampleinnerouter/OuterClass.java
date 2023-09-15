package com.test.fifthday.exampleinnerouter;

public class OuterClass {
	private static String str = "Riju";
	static String str1 = "Samanta";

	public String test(String name) {
		return name;
	}

	static class Inner {
		public void test1() {
			System.out.println("inner class test1 method");
		}

		public static void test2() {
			System.out.println(str + " inner class test2 static method");
		}
	}

//	class Inner {
//		public void test1() {
//			System.out.println("inner class test1 method");
//		}
//
//		public void test2() {
//			System.out.println(str + " inner class test2 static method");
//		}
//	}

}
