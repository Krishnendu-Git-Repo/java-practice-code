package com.test.setExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
	User user1 = new User(10, 20);
	User user2 = new User(10, 20);
	User user3 = new User(10, 20);
	
	Set<User> setUser = new HashSet<>();
	setUser.add(user1);
	setUser.add(user2);
	setUser.add(user3);
	System.out.println("Size is"+ setUser.size());
	}

}
