package com.test.thirdday.blockexecutation;


public class TestTryCatchBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println("java"+ 1/0);
		}catch (Exception e) {
		System.out.println("hello");
//		}catch (ArithmeticException  e1) {   if we handle any exception using Exception class then after that we can not handle
//		                                     any type of exception using catch block. it will give compile time error.
			
		}

	}

}
