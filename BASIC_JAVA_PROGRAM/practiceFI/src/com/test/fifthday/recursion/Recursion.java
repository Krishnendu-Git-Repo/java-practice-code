package com.test.fifthday.recursion;

public class Recursion {
	public static Integer factorial(Integer n) {
		if (n == 0) {
			return 1;
		} else {
			Integer fact = n * factorial(n - 1);
			return fact;
		}

	}

	public static void main(String[] args) {

		Integer factorial = factorial(5);
		System.out.println(factorial);
	}

}
//@FunctionalInterface
//interface MathOperation {
//   int operate(int a, int b);
//}
//
//@FunctionalInterface
//interface AdvancedMathOperation extends MathOperation {
//   double operate(double a, double b);
//}

