package com.kdpatil;

public class LargestNumAmong3UsingTernaryOper {

	public static void main(String[] args) {

		int a=22;
		int b=5;
		int c=789;
//		int largest1=a>b?a:b;
//		int largest2=c>largest1?c:largest1;
//		System.out.println("Largest : "+largest2);
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest : "+largest);
		
	}

}
