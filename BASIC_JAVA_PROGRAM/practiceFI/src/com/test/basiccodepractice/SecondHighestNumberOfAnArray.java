package com.test.basiccodepractice;

public class SecondHighestNumberOfAnArray {

	public static void main(String[] args) {
		Integer[] array = { 50, 61, 1, 3, 70, 10, 5, 25};
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(Integer i : array) {
        	if(i > largest) {
        		//System.out.println("inside if value of i   "+i);
        		//System.out.println("inside if value of largest    "+largest);
        		secondLargest =	largest;
        		//System.out.println("inside if value of secondLargest    "+secondLargest);
        		largest =i;
        		//System.out.println("inside if after assign value of largest    "+largest);
        	}else if ( i > secondLargest) {
        		secondLargest = i;
			}
        }
        System.out.println("Second Largest is: "+secondLargest+"\n" + "Largest is: "+largest);

	}

}
