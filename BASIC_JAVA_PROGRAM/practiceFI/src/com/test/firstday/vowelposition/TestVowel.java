package com.test.firstday.vowelposition;

public class TestVowel {
	public String str = "This is my vowel count program";

	/* this method for vowel position */
	public void vowelCount() {
		String lowerCase = str.toLowerCase();
		for (int i = 0; i < lowerCase.length(); i++) {
			if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i'
					|| lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u') {
             System.out.println(lowerCase.charAt(i)+" at position "+i);
			}
		}
	}
	
	/* this method for find duplicate character */
	public void duplicateCharacter() {
		char[] charArray = str.toLowerCase().toCharArray();
		for(int i=0; i< charArray.length; i++) {
			int count=1;
			for(int j=i+1; j< charArray.length; j++) {
				if(charArray[i]== charArray[j]) {
					count++;
					charArray[j]='0';
				}
			}
			if(count > 1 && charArray[i]!='0') {
				System.out.println(charArray[i]);
			}
		}
	}
}
