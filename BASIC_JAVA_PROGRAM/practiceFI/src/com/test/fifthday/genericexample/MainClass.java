package com.test.fifthday.genericexample;

public class MainClass {

	public static void main(String[] args) {
		ClassGeneric<Integer> generic= new ClassGeneric<Integer>(50);
		System.out.println(generic.getT());
		
		ClassGeneric<Integer> generic2= new ClassGeneric<Integer>();
		System.out.println(generic2.getT());
		
		ClassGeneric<String> generic3= new ClassGeneric<String>("Krishnendu");
		String t = generic3.getT();
		System.out.println(t);
		
		Integer[] arr= {2,3,4,7};
		String[] array= {"Riju","Krishnendu","Samanta"};
		TestGeneric testGeneric= new TestGeneric();
		testGeneric.printArray(array);
		testGeneric.printArray(arr);
		

	}

}
