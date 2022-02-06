package com.kdpatil;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int original_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num = num/10;
		}
		if(original_num==rev)
		{
			System.out.println("It is palindrome number : "+original_num);
		}
		else
		{
			System.out.println("It is not palindrome number : "+original_num);
		}
	}

}
