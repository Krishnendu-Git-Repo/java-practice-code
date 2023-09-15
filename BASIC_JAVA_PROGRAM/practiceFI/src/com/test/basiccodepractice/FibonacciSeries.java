package com.test.basiccodepractice;

public class FibonacciSeries {
	static Integer num = 0;
	static Integer num1 = 0;
	static Integer num2 = 1;

	public static void main(String[] args) {
		System.out.print(num1 + " " + num2);
		new FibonacciSeries().recursion(0, 10);	
	}
	/* Fibonacci series using recursion */ 
	public  void recursion(int start, int length) {
		for (int i = start; i < length; i++) {
			num = num1 + num2;
			System.out.print(" " + num);
			num1 = num2;
			num2 = num;
		}
	}

}
