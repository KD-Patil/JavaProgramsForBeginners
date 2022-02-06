package com.kdpatil;

public class LargestNumAmong3 {

	public static void main(String[] args) {

		int num1=11,num2=1089,num3=987;
		if(num1>num2 && num1>num3)
		{
			System.out.println("Num1 is largest : "+num1);
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Num2 is largest : "+num2);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("Num3 is largest : "+num3);
		}
	}

}
