package com.test.fifthday.abstractexample;

public class Test {

	public static void main(String[] args) {
		Integer[] arr= {};
		System.out.println("Hello");
		main(arr);
		//main(args); // will occur error(stack over flow) because of recursion

	}
	
	public static void main(Integer[] args) {
		System.out.println("World");
	}

}
