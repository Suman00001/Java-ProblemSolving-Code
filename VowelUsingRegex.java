package com.interview;

public class VowelUsingRegex {
	
		 public static void main(String[] args) {
		 
		System.out.println(stringContainsVowels("Hello")); // True
		 System.out.println(stringContainsVowels("TV")); // False
		 System.out.println(stringContainsVowels("Suman")); // True
		 
		 }
	
	 public static boolean stringContainsVowels(String input) {
		 
		 //Find that the String contains Vowel or Not
	
		return input.toLowerCase().matches(".*[aeiou].*");
		
		}
	
		


}
