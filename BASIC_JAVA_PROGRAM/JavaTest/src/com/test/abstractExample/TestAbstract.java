package com.test.abstractExample;

public abstract class TestAbstract {

	Integer arr[]= {2,8,9,7,6,70};	
	public abstract void m2();
	public abstract void m3();
	
	public void m1() {
		for(Integer i : arr) {
			System.out.println(i);
		}
	}	
}
 abstract class Test extends TestAbstract{
	 public abstract void m2();
}
 class Test2 extends TestAbstract{
	@Override
	public void m2() {
	System.out.println("Krishnendu Samanta");		
	}

	@Override
	public void m3() {
		System.out.println("override");
		
	}
	 
 }




