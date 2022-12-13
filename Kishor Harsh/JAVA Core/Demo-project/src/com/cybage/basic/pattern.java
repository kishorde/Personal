package com.cybage.basic;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int j;
		int k;
		int n=3;
		for(i=0;i<n;i++)
		{
			for(k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(j=0;j<=2*i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
