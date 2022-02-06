package com.kdpatil;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		PrimeNumber p1 = new PrimeNumber();
		p1.isPrime(num);
	}

	private void isPrime(int num) {
		int count=0;
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0){
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("The number is prime : "+num);
			}
			else
			{
				System.out.println("The number is not prime : "+num);
				
			}
		}
		else
		{
			System.out.println("The number is not prime : "+num);
			
		}
	}

}
