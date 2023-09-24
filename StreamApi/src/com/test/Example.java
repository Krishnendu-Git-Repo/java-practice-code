package com.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
//	public static <T> Stream<T> getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) 
//    { 
//      return stream.skip(startIndex).limit(endIndex - startIndex + 1); 
//    } 
	public static void main(String[] args) {
		

//		List<Integer> number=Arrays.asList(2,3,4,6,8,10,7,9,15);
//		List<Integer> num=Arrays.asList(2,1,4,3,5,8);
//		
//        List<User> list=new ArrayList<>();
//		
//		
//		User user1 = new User(1,"krish","samanta",25);
//		User user2 = new User(2,"Rahul","Das",23);
//		User user3 = new User(3,"Riju","Sharma",25);
//		User user4 = new User(2,"Akash","Dolui",24);
//		//List<User> list=Arrays.asList(user1,user2,user3,user4);
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
//		list.add(user4);
//		//List<Integer> collect = number.stream().filter(e->(e>5)).sorted().collect(Collectors.toList());
//		//number.stream().filter(e->(e>5)).sorted().skip(1).limit(2).forEach(a-> System.out.println(a));
//		Integer integer = number.stream().filter(e->(e>5)).sorted().findFirst().orElse(-1);
//		Integer orElse = num.stream().filter(e->(e>5)).sorted().findFirst().orElse(-1);
//		System.out.println(integer);
//		System.out.println(orElse);
//		//System.out.println(collect);
//		
////		Stream<Integer> intStream = collect.stream();
////		Stream<Integer> sliceOfIntStream =getSliceOfStream(intStream, 1, 2);
////		
////		 sliceOfIntStream.forEach(System.out::println);
////		
//		//list.stream().filter(e->e.getId().equals("2")).forEach(e-> System.out.println(e));
//		
////		Stream<Integer> stream = number.stream();
////		list.stream().map(user -> number.stream().filter(id -> id  == user.getId())).forEach(user -> System.out.println(user));
//		list.stream().filter(user -> number.stream().anyMatch(id -> user.getId() == id))
//				.forEach(user -> System.out.println(user));
//		
//		for(int i=0;i<list.size();i++) {
//			for(int j=0;j<number.size();j++) {
//				if(list.get(i).getId()== number.get(j)) {
//					System.out.println(list.get(i));
//				}
//			}
//					
//		}
		
		Calendar calendar= Calendar.getInstance();
		//calendar.setTime(new Date());
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
		calendar.add(Calendar.DATE, 5);
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println(calendar.getTime());
		System.out.println(format);
		
	}
	

}
