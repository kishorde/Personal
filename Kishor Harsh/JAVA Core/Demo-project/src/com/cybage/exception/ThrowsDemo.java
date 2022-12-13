package com.cybage.exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void demo() throws IOException
	{
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if you write method only in main then u should write throws IOException after (String[] args)  
		
		try {
			demo();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
