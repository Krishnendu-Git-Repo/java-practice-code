package com.test.interfaceinsideclass;

import com.test.interfaceinsideclass.MyClass.MyInterface;

public class MainClass {

	public static void main(String[] args) {
		MyClass myClass= new MyClass();
		MyInterface myInterface= new MyClass.MyInterface() {			
			@Override
			public void m1() {
				System.out.println("hello");
				
			}
		};
		myInterface.m1();
      System.out.println(myClass.x);
	}

}
