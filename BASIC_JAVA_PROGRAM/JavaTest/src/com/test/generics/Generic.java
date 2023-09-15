package com.test.generics;

public class Generic {
	public <T> void printArray(T[] a) {
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
}
}
