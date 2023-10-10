package com.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// Check the number is Prime or not
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int a=0;
		try{
			a=sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Warning !! Please Enter Right Input");
			System.exit(a);
		}
		boolean flag=true;
		if(a<=0||a==1) {
			System.out.println("It is Not a Prime Number");
			flag=false;
		}
		else if(a==2) {
			System.out.println("It is a Prime Number");
			flag=false;
		}
		for(int i=2;i<=a/2;i++) {
			int b=a%i;
			if(b==0) {
				System.out.println("It is not a Prime Number");
				flag=false;
				break;
			}
			else {
				continue;
			}
			
		}
		if(flag) {
			System.out.println("It is a Prime Number");
		}
	}

}
