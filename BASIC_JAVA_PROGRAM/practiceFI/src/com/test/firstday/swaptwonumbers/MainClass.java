package com.test.firstday.swaptwonumbers;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner= new Scanner(System.in);
		System.out.println("please enter the a and b");
		a= scanner.nextInt();
		b= scanner.nextInt();
		
		SwapWithThirdVariable swapWithThirdVariable= new SwapWithThirdVariable();
		swapWithThirdVariable.swap(a, b);
			
		SwapWithoutThirdVariable.swap(a, b);
	}

}
