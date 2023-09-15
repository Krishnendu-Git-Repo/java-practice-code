package com.test.nonstaticandstaticinnerclass;

import com.test.nonstaticandstaticinnerclass.OuterClass.NonStaticInnerClass;
import com.test.nonstaticandstaticinnerclass.OuterClass.StaticInnerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		
		//calling the variables of outer class
		System.out.println(outerClass.name);
		System.out.println(OuterClass.address);
		
		//calling the methods of outer class
		outerClass.m1();
		OuterClass.m3();
		
		//create the instance of non static inner class
		NonStaticInnerClass nonStaticInnerClass = outerClass.new NonStaticInnerClass();
		nonStaticInnerClass.m4();
		
		//create the instance of static inner class
		StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		staticInnerClass.m5();
		

	}

}
