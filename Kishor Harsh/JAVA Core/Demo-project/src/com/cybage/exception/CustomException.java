package com.cybage.exception;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 17;
		try {
		if(age < 18)
			{
				throw new AgeException("Small child");
			}
		}
		catch(AgeException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
