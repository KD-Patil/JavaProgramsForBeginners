package com.kdpatil;

import java.util.Scanner;

public class ReverseString3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		System.out.println("StringBUilder");
		System.out.println("Enter String : ");
		String str2 = sc.nextLine();
		StringBuilder sbl = new StringBuilder();
		sbl.append(str2);
		System.out.println(sbl.reverse());
		
		
	}

}
