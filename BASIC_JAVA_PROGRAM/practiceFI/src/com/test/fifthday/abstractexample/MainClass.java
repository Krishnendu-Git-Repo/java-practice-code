package com.test.fifthday.abstractexample;

public class MainClass {

	public static void main(String[] args) {
		AbstractImpl abstractImpl= new AbstractImpl();
		abstractImpl.m1();
		abstractImpl.m2();
		
		ExampleAbstract abstract1= new ExampleAbstract() {
			
			@Override
			void m1() {
				System.out.println("anonomyous");
				
			}
		};
		abstract1.m1();
		
		Example example= new Example() {
			
			@Override
			void m1() {
				System.out.println("anonomyous...2");
				
			}
		};
		example.m1();
		example.m2();

		
	}

}
