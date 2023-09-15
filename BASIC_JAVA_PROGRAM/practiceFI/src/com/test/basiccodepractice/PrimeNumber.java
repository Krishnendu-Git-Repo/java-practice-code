package com.test.basiccodepractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number :");
		Integer number = scanner.nextInt();
		if(number ==0 || number ==1) {
			System.out.println(number +" is not prime");
		}
		Boolean isPrime= true;
		for(int i=2; i<= number/2; ++i) {
			if(number % i==0) {
				isPrime= false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
