package com.arrayprograms;

public class PrintMaxArr {
	public static void main(String[] args) {
		
		int a[]= {2,7,5,3,8};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		
		
		}
		System.out.println(max);
	
		
	}

}
