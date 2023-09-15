package com.test.classinsideinterface;

import com.test.classinsideinterface.MyInterface.MyClass;

public class MainClass {
	public static void main(String[] args) {
	MyClass myClass = new MyInterface.MyClass();
	myClass.m2();
	
	}
}
