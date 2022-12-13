package com.cybage.junit;

public class MathOperations {

	public int add(int n1, int n2) {
//		if(n1>1000)
//		{
//			throw new IllegalArguementException("number should be  less than 1000");
//		}
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	public boolean check(String msg) {
		if (msg.length() > 3) {
			return true;
		} else
			return false;
	}
}
