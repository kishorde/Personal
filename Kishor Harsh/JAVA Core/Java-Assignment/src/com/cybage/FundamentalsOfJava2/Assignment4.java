package com.cybage.FundamentalsOfJava2;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,5,6};
		
		int index=3;
		int value=10;
		

		
		for(int i=array.length-1;i>index;i--)
		{
			array[i]=array[i-1];
		}
		array[index]=value;
		

		 for(int i=0;i<array.length;i++)
		 {
			 System.out.print(array[i]+" ");
		 }
		

	}

}
