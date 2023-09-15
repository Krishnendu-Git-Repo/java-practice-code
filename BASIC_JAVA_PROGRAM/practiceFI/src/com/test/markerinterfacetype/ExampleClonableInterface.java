package com.test.markerinterfacetype;

public class ExampleClonableInterface implements Cloneable {
	public String name;
	public Integer roll;

	public ExampleClonableInterface(String name, Integer roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
//	@Override
	public Object m1() throws CloneNotSupportedException {
	return super.clone();	
	}

	public static void main(String[] args) {
		ExampleClonableInterface clonableInterface1= new ExampleClonableInterface("Krishnendu", 20);
		try {
			ExampleClonableInterface clonableInterface2 = (ExampleClonableInterface) clonableInterface1.m1();
			
			System.out.println(clonableInterface1.name);
			System.out.println(clonableInterface2.name);
			
			clonableInterface1.name="Riju";
			System.out.println(clonableInterface1.name);
			System.out.println(clonableInterface2.name);
			
			ExampleClonableInterface clonableInterface3= (ExampleClonableInterface) clonableInterface1.clone();
			System.out.println(clonableInterface1.name);
			System.out.println(clonableInterface2.name);
			System.out.println(clonableInterface3.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
