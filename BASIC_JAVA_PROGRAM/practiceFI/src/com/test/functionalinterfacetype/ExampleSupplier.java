package com.test.functionalinterfacetype;

import java.util.function.Supplier;

public class ExampleSupplier {

	public static void main(String[] args) {
		Supplier<Integer> number= () -> 10;
		Supplier<Integer> num= () -> new Integer(200);
		Integer integer = number.get();
		Integer integer1 = num.get();
		System.out.println(integer);
		System.out.println(integer1);
		
		
		Supplier<String> name= () -> "Krishnendu";
		String string = name.get();
		System.out.println(string);
	}

}
