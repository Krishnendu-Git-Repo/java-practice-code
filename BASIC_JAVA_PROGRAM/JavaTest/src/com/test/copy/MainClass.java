package com.test.copy;

public class MainClass implements Cloneable{

	public static void main(String[] args) {
		ExampleSallowCopy copy= new ExampleSallowCopy();
		ExampleSallowCopy copy1= new ExampleSallowCopy();
		copy1= copy;		
        copy.x=50;
        System.out.println(copy.x);
        System.out.println(copy1.x);
        
        ExampleDeepCopy deepCopy= new ExampleDeepCopy();
        ExampleDeepCopy deepCopy1= new ExampleDeepCopy();
        deepCopy1.y=100;
        System.out.println(deepCopy.y);
        System.out.println(deepCopy1.y);
        
		B b = new B();

		String s1 = "HELLO";
		String sb = new StringBuilder("HELLO").toString();
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		Test test = new Test(25);
		Integer k = 10;
		System.out.println(s1.toString().hashCode());
		k = 10;
		System.out.println(s3.toString().hashCode());
		new Z();

		String st1 = "Riju";
		String st2 = new StringBuilder("Riju").toString();
		String st3 = new String("Riju");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st2 == st3);	
		
		String str1= new String("java");
		String str2= new String("JAVA");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
