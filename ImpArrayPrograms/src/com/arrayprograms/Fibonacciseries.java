package com.arrayprograms;

public class Fibonacciseries {
	public static void main(String[] args) {
		int a=0,b=1,add;
		for(int i=2;i<=5;i++)
		{
			add=a+b;
			System.out.println("addition of first two no is:-"+add);
			a=b;
			b=add;
			
			
		}
		
	}

}
