package com.test.basiccodepractice;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println(recursionOfNumber(5));

	}
	public static Integer recursionOfNumber(Integer number) {
		if(number == 0) {
			return 1;
		}else {
			return number*recursionOfNumber(number-1);
		}
	}

}
