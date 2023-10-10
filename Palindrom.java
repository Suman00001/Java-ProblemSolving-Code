package com.interview;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		// Palindrom
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your String : ");
			String str=sc.nextLine();
			String b ="";
			
			System.out.println("Reverse String is : ");
			for(int i=str.length()-1;i>=0;i--) {
			b= b+str.charAt(i);
			}
	          System.out.println(b);
	          
	          if (str.equals(b)) {
	        	  System.out.println(" palindrom");
	          }
	        	  else {
	        		  System.out.println(" no");
	        	  
	          }
		}

	}

}
