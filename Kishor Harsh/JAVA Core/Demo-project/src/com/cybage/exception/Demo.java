package com.cybage.exception;

public class Demo {

	public static void main(String[] args)
	{
		try {
		int a=10;
		int l=args.length;
		int b=l;
		int c=a/l;
		
		int arr[]=new int[5];
		System.out.println(arr[5]);
		
//		System.out.println("c = "+c);
		}
//		catch (ArithmeticException e) {			//if we want exception name then you can use ArithmaticException instead of Exception
				
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
		}

//		catch (Exception e) {	
////			System.out.println(e.getMessage());
//			e.printStackTrace();  		//both can be used getMessage or printStackTrace
//		}
		
		finally {
			System.out.println("This is finally block");
		}
		
		
		System.out.println("After catch block...");
		
	}
}
