package com.test.fifthday.immutableclass;

public class MainClass {

	public static void main(String[] args) {
		Student student = new Student("Krishnendu", 20);
		Integer age = student.getAge();
		String name = student.getName();
		System.out.println(age+" "+name);
		
//		Student student1 = new Student();
//		System.out.println(student1.getName()+" "+student1.getAge());
	}

}
