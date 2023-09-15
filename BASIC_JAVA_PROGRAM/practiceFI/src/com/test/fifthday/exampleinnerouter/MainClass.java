package com.test.fifthday.exampleinnerouter;

import com.test.fifthday.exampleinnerouter.OuterClass.Inner;

public class MainClass {

	static public void main(String[] args) {
		OuterClass outerClass= new OuterClass();
		String test = outerClass.test("Krishnendu");
		System.out.println(test);
		System.out.println(OuterClass.str1);
		
		/* if inner class is static then we can call method like this */
		Inner outerInner= new OuterClass.Inner();
		outerInner.test1();
		Inner.test2();
		
		/* if inner class is not static then we can call method like this */
//		Inner inner=  outerClass.new Inner();
//		inner.test1();
//		inner.test2();

	}

}
