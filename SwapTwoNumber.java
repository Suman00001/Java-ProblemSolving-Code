package com.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @Suman
*/
public class SwapTwoNumber {

	public static void main(String[] args) {
		// Swap two number Without using other variable
		
		
				
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				
						int firstNumber=0;
						int secondNumber=0;
				try{
					System.out.println("Enter the First Number : ");
					firstNumber =sc.nextInt();
					System.out.println("Enter the Second Number : ");
					secondNumber = sc.nextInt();
			}catch(InputMismatchException e){
					System.out.println("Warning !! Please enter Right input");
					System.exit(0);
			}catch(Exception e){
				System.out.println(e);
		}
				
				
				
				
				secondNumber =firstNumber+secondNumber;
				firstNumber=secondNumber-firstNumber;
				secondNumber=secondNumber-firstNumber;
				System.out.println("The Swap Process is Running....");
				System.out.println("Now the value of First Number is : "+firstNumber);
				System.out.println("Now the value of Second Number is : "+secondNumber);
			

		
	}

}
