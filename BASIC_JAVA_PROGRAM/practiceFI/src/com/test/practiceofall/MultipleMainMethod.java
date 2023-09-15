package com.test.practiceofall;

public class MultipleMainMethod {
	static Integer[] array = {};

	public static void main(String[] args) {
		System.out.println("main method String args");
        main(array);
        //main(args);
	}

	public static void main(Integer[] args) {
		System.out.println("main method Integer args");
	}

}
