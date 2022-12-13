package com.cybage.junit;

import org.junit.Test;

public class DemoTest {
	
	//Not able to complete execution in 100ms;
	@Test(timeout = 100)
	public void testRandom()
	{
		Demo demo = new Demo();
		demo.random();
	}
}
