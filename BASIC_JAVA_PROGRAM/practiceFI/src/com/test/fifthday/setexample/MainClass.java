package com.test.fifthday.setexample;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
	Student student= new Student("Krishnendu", 25);
	Student student1= new Student("Krishnendu", 25);
	Student student2= new Student("Krishnendu", 25);
	
	Set<Student> students= new HashSet<>();
	students.add(student);
	students.add(student1);
	students.add(student2);
	
	System.out.println(students.size());
	
	
	int i = 5;
	int j = i++ + --i - ++i;
	System.out.println(i+" "+j);
	
	}

}
