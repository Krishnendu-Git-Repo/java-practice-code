package com.test.fifthday.copyexample;

public class MainClass {

	public static void main(String[] args) {
		ShallowCopy shallowCopy= new ShallowCopy();
		ShallowCopy shallowCopy2= new ShallowCopy();
		shallowCopy= shallowCopy2;
		shallowCopy2.x=50;
		shallowCopy2.a=500;
		System.out.println(shallowCopy2.x+" "+shallowCopy2.a);
		System.out.println(shallowCopy.x);
		
		
		
		DeepCopy deepCopy= new DeepCopy();
		DeepCopy deepCopy2= new DeepCopy();
		deepCopy2.y=100;
		System.out.println(deepCopy.y);
		System.out.println(deepCopy2.y);
	}

}
