package com.test.basiccodepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestExample {
    public static void main(String[] args) {
        String name = "Krishnendu";
        int vowelCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("The number of vowels is: " + vowelCount);



        List<Integer> num= Arrays.asList(10,5,21,14,16,17,52,200,111,1000,100000,111111);
        List<Integer> newList = new ArrayList<>();
        for (Integer number : num) {
            if (String.valueOf(number).startsWith("1")) {
                newList.add(number);
            }
        }
        System.out.println(newList);



        //String name = "Krishnendu";
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString += name.charAt(i);
        }
        System.out.println("The reversed string is: " + reversedString);



        int duplicateCount = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    duplicateCount++;
                    //break;
                    System.out.println(name.charAt(i) + "is" +duplicateCount);
                }
            }
        }


        String str = "krishnendunendu";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Print the counts of duplicate characters
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 1) {
                System.out.println("Character '" + c + "' appears " + count + " times.");
            }
        }

    }
    }

