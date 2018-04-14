package com.niit;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the userinput");
		int i=sc.nextInt();
		while(i>0){
			int rem=i%10;
			{
				sum=sum+rem;
			}
			i=i/10;
		}
		if(sum%2==0){
			System.out.println("Sum of odd digits number");
		}
		else{
			System.out.println("Sum of even digits number");
		}
		
		
	}

}
