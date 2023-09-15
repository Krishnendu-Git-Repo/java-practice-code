package com.test.basiccodepractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = scanner.nextInt();
		int originalNumber=number;
		int sum = 0;
		int digit= String.valueOf(number).length();
		
//		while(number !=0) {
//			int rem= number % 10;
//			sum += Math.pow(rem, digit);
//			number /=10;
//		}
		
		for(int i=1;i<=digit; i++) {
			int rem= number % 10;
			sum += Math.pow(rem, digit);
			number /=10;	
		}
		if(sum==originalNumber) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
