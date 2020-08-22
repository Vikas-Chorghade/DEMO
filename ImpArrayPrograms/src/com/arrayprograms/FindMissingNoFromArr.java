package com.arrayprograms;

public class FindMissingNoFromArr {

	public static void main(String[] args) {
		
		int currno=0;
		int a[]= {5,8,};
		
		for (int i = 0; i < a.length; i++)
		{
		currno=a[i];
		if(a.length!=(i+1))
		{
			if(currno+1!=a[i+1])
			{
				currno++;
				for(int j=currno;j<a[i+1];j++)
				{
					System.out.print(" "+j);
				}
				
			}
		}

	}
		System.out.println();
		System.out.println("Length:-"+a.length);
		System.out.println(a[1]);

}
}
