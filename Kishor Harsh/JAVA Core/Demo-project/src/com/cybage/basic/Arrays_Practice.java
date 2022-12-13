package com.cybage.basic;

public class Arrays_Practice {
	
	public static void main(String args[])
	{
		int[] arr1 =  new int[10];
		
		arr1[0]=10;
		arr1[1]=20;
		
		int[] arr2 = {1,2,3,4,5,6,7};
		

		System.out.println("For loop");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println("\n\nFor each type loop");
//		for each
		for(int j:arr2)
		{
			System.out.print(j);
		}
		
		
		System.out.println("\n\nTwo dimensional array: ");
		//two dimensional array
		int array[][] = { {1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
