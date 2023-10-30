package com.test.basiccodepractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SampleDuplicateValueCount {
    public static void main(String [] args) {
        Integer [] array= {2,3,4,3,5,2,6,6};
        for(int i=0; i< array.length; i++){
            for(int j= i+1; j< array.length; j++) {
                if(array[i] == array[j]) {
                    System.out.print(array[i]);
                }
            }
        }
        //Arrays.stream(array).collect(Collectors.toList())
    }
}
