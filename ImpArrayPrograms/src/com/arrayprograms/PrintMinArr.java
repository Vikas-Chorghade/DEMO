package com.arrayprograms;

public class PrintMinArr {
	public static void main(String[] args) {
		int a[]= {5,8,7,3,5};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
	}

}
