package com.test.firstday.java8features;

import java.util.Random;

public class PrintRandomNumber {
public static void printNumber() {
	Random random= new Random();
	random.ints().limit(10).forEach(e -> System.out.println(e));
}
}
