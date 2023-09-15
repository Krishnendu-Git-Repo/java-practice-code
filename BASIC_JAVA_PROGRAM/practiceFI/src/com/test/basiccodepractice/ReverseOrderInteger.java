package com.test.basiccodepractice;

import java.util.Scanner;

public class ReverseOrderInteger {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value: ");
		Integer number = scanner.nextInt();
		if(number > 0) {
		for(int i=number; i>0;i--) {
			System.out.println(i);
		}
		}else {
			for(int i=number; i<0;i++) {
				System.out.println(i);
			}
		}

	}

}
