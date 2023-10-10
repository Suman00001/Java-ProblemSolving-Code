package com.interview;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		// Check Vowel is Present or Not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String vowel=sc.nextLine();
		boolean a=true;
		
		for(int i=0;i<vowel.length();i++) {
			if(vowel.toLowerCase().charAt(i)=='a'||vowel.toLowerCase().charAt(i)=='e'||
				vowel.toLowerCase().charAt(i)=='i'||vowel.toLowerCase().charAt(i)=='o'||
				vowel.toLowerCase().charAt(i)=='u') {
				System.out.println("Vowel is Present in The String");
				a=false;
				break;
			}
			else {
				continue;
			}
		}
		if(a) {
			System.out.println("Vowel is Not Present in The String");
		}
		
	}

}
