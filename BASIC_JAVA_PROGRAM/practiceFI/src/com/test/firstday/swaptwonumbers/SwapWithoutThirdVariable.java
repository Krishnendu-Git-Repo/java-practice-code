package com.test.firstday.swaptwonumbers;

public class SwapWithoutThirdVariable {
public static void swap(int x, int y) {
	x= x+y;
	y=x-y;  //(x+y)-y
	x= x-y; //(x+y)-x
	System.out.println("after swap without third variable "+x+" "+y);
}
}
