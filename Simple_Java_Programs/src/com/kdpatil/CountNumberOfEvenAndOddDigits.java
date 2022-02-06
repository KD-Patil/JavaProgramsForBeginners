package com.kdpatil;

import java.util.Scanner;

public class CountNumberOfEvenAndOddDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int even=0, odd=0;
		
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				System.out.println("even==>"+rem);
				even++;
			}
			else{
				System.out.println("odd::"+rem);
				odd++;
			}
			num=num/10;
		}
		
		System.out.println("Even Digits : "+even);
		System.out.println("Odd Digits : "+odd);
		
	}

}
