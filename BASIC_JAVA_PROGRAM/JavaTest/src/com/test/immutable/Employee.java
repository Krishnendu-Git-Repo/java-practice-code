package com.test.immutable;

public class Employee {

	public static void main(String[] args) {
		MyImmutableClass immutableClass= new MyImmutableClass("Krishnendu", 25);
        int age = immutableClass.getAge();
        String name = immutableClass.getName();
        System.out.println(age+" "+name);
		
        
//       User user1= new User(10, 25);
//		 User user2= new User(10, 25);
//		 User user3= new User(10, 25);
//		 Set<User> set= new HashSet<>();
//		 set.add(user1);
//		 set.add(user2);
//		 set.add(user3);
//		 System.err.println("size is"+set.size());
	}

}
