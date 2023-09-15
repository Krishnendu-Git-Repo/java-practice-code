package com.test.basiccodepractice;

import java.util.Arrays;

public class ArraySortUsingOneLopp {

	public static void main(String[] args) {
		int[] array= {5,10,1,6,3,48,50,2,4};
	int[] sortArrays = sortArrays(array);
	System.out.println(Arrays.toString(sortArrays));

	}
	public static int[] sortArrays(int[] arr)
    {
 
        // Finding the length of array 'arr'
        int length = arr.length;
 
        // Sorting using a single loop
        for (int j = 0; j < length - 1; j++) {
 
            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {
 
                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
 
                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }
 
        return arr;
    }

}
