package com.test.firstday.swaptwonumbers;

public class SwapWithThirdVariable {
private int z;
public void swap(int x, int y) {
	z=x;
	x=y;
	y=z;
	System.out.println("after swap with third variable "+x+" "+y);
}
}
