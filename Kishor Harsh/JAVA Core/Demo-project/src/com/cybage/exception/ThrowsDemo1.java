package com.cybage.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class parent
{
	
	public void demo() throws IOException,IOException
	{
		throw new IOException();
	}
}

class child extends parent
{
	public void demo() throws FileNotFoundException,IOException
	{
		throw new NullPointerException();
	}
}
public class ThrowsDemo1 {

	public static void main(String[] args)
	{
		
	}
}
