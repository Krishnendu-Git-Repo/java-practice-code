package com.test.firstday.java8features;

import java.util.StringJoiner;

public class MainClass {

	public static void main(String[] args) {
		/* for string joiner */
		ExampleStringJoin exampleStringJoin= new ExampleStringJoin();
		exampleStringJoin.stringJoin();
		StringJoiner stringJoins = ExampleStringJoin.stringJoins();
		System.out.println(stringJoins);
		
		/* print random number */
		PrintRandomNumber.printNumber();
		
		
		
	}

}
