package com.test.secondday.java8features;

import java.util.AbstractList;
import java.util.ArrayList;

public abstract class ArrayListExample {
	 
	public static void main(String[] args) {
		AbstractList<Integer> abstractList= new ArrayList<>();
		abstractList.add(1);
		abstractList.add(2);
		abstractList.add(3);
		abstractList.forEach(System.out:: println);
	}

}
