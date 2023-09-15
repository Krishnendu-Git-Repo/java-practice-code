package com.test.basiccodepractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value :");
		String name = scanner.nextLine();
		String reverseString="";
		for(int i= name.length()-1; i>=0;i--) {
			reverseString+=name.toUpperCase().charAt(i);
		}
		System.out.println(reverseString);

	}

}
