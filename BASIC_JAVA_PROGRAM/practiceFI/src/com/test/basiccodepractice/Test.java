package com.test.basiccodepractice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		int originalNumber= number;
//		int digit= String.valueOf(number).length();
		while(number !=0) {
			int reminder= number%10;
			sum+= Math.pow(reminder,3);
			number/=10;
		}
		if(sum == originalNumber) {
			System.out.println(originalNumber+" is palindrome number");
		}else {
			System.out.println(originalNumber+" is not palindrome number");
		}

	}

}
