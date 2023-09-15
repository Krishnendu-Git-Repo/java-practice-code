package com.test.fifthday.genericexample;

public class TestGeneric {
public<T> void printArray(T[] arr) {
	for(T i : arr) {
		System.out.println(i);
	}
}
}
