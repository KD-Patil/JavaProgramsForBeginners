package com.kdpatil;
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
public class FibonacciNumberSeries {

	public static void main(String[] args) {
		int lim=1;
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		while(lim<=13)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			lim++;
		}
	}

}
