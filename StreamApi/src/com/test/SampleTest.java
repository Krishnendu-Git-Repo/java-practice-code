package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleTest {

	public static void main(String[] args) {
		
//		User user=new User();
//		user.getfName();
//		user.getlName();
//		user.getAge();
//		user.getId();
		List<User> list=new ArrayList<>();
		
		
		User user1 = new User(1,"krish","samanta",25);
		User user2 = new User(2,"Rahul","Das",23);
		User user3 = new User(3,"Riju","Sharma",25);
		User user4 = new User(2,"Akash","Dolui",24);
		//List<User> list=Arrays.asList(user1,user2,user3,user4);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		//System.out.println(list);
		
		
		
		

	}

}
