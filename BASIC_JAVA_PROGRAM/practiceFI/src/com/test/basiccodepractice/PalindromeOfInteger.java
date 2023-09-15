package com.test.basiccodepractice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeOfInteger {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the number :");
//		int number = scanner.nextInt();
		
		
		int[] arr= {1,2,89,4,555,6};
		Arrays.stream(arr).sorted().forEach(e->System.out.println(e));
//		for(int i= arr.length-1; i>=0;i--) {
//			System.out.println(arr[i]);
//		}

	}

}
