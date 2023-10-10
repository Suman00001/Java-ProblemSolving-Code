package com.interview;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// Reverse a String
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your String : ");
			String str=sc.nextLine();
			
			System.out.println("Reverse String is : ");
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
	          
		}

	}

}
