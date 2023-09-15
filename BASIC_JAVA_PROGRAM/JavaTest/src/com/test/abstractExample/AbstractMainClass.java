package com.test.abstractExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class AbstractMainClass {

	public static void main(String[] args) {
		
		
//		TestAbstract abstract1= new TestAbstract() {
//			@Override
//			public void m2() {
//				System.out.println("hiiii");
//				
//			}
//
//			@Override
//			public void m3() {
//				System.out.println("hello");
//				
//			}};
//		abstract1.m1();
//
//		Test2 test2= new Test2();
//		test2.m1();
//		test2.m2();
////		
//		abstract1.m2();
//		abstract1.m3();
		
////		List<Integer> integers= Arrays.asList(2,4,5,8,3,7);
////		integers.add(20);
//		System.out.println(integers);
		
		
		
//		String a="A";
//		String b= "B";
//		a.concat(b);
//		System.out.println(a);
		
		List<Integer> name= new CopyOnWriteArrayList<>();

		name.add(5);
		name.add(2);
		name.add(10);
		name.add(50);
//		System.out.println(name);
//		name.remove(1);
//		System.out.println(name);
		for(Integer i: name) {
			name.remove(i);
		}
		System.out.println(name.size());
		
		  Map<Integer, Integer> map = new HashMap<>();  
	        map.put(1, 1);  
	        map.put(2, 2);  
	        map.put(3,3);  
	        
	        map.put(1, 55);
	        map.put(1, 10);
	        System.out.println(map);
		
	}

}
