package com.test.basiccodepractice;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string :");
		String name = scanner.nextLine();
		String reverseName="";
		for(int i=name.length()-1; i>=0; i--) {
			reverseName+=name.charAt(i);
		}
		if(name.equals(reverseName)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
