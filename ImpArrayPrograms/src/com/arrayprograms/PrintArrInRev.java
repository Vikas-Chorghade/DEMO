package com.arrayprograms;

public class PrintArrInRev {
	public static void main(String[] args) {
		
		int a[]= {2,8,7,4,9};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
