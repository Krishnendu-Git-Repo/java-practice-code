package com.test.practiceofall;

public class PracticeTest {
    Integer factorial = 1;
    public Integer fact(Integer x){

       factorial= x*(x-1);
        return fact(factorial);
    }
    public static void main(String[] args){
        PracticeTest test= new PracticeTest();
        Integer result= test.fact(4);
        System.out.println(result);
    }
}
