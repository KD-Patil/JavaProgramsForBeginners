package com.kdpatil;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.nextLine();
		String original_str=str;
		String rev="";
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(original_str.equals(rev))
		{
			System.out.println("Palindrome string : "+original_str);
		}
		else
		{
			System.out.println("Not Palindrome string : "+original_str);
				
		}
		
	}

}
