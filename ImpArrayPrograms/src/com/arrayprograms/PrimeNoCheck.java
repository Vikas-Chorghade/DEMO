package com.arrayprograms;
import java.util.Scanner;
public class PrimeNoCheck {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	
		int no=sc.nextInt();
		sc.close();
		for(int i=0;i<no;i++)
		{
			if(i%no==0)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Number is Prime number:-"+no);
		}
		else
		{
			System.out.println("Number is not Prime Number"+no);
		}
		
		
			}

}
