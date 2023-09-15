package com.test.innerOuter;

import com.test.innerOuter.InnerOuterExample.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		InnerOuterExample example= new InnerOuterExample();
		InnerClass inner= example.new InnerClass();
		inner.m1();
		inner.m2();

	}

}
