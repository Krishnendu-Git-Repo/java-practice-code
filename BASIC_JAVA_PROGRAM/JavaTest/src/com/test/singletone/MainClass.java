package com.test.singletone;
@SuppressWarnings("all")
public class MainClass {
	public static void main(String[] args) {

		ClassSingleTone classSingleTone = ClassSingleTone.getmethod();
		ClassSingleTone classSingleTone2 = ClassSingleTone.getmethod();		
		ClassSingleTone classSingleTone3 = ClassSingleTone.getmethod();
//		System.out.println(classSingleTone.hashCode());
//		System.out.println(classSingleTone2.hashCode());
//		System.out.println(classSingleTone3.hashCode());
	}
}
