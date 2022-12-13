package com.cybage.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOperationsTest {

	static MathOperations mOperations = null; //

	@BeforeClass
	public static void beforeClassMethod() {
		mOperations = new MathOperations();
		System.out.println("before class method");
	}
	
	@AfterClass
	public static void afterClassMethod()
	{
		mOperations=null;
		System.err.println("After class method....");
	}
	
	//this method is called before each test case
	@Before
	public void beforeMethod()
	{
		System.out.println("Befor method!");
	}
	
	@After
	public void afterMethod()
	{
		System.out.println("After method!");
	}

	@Test
	public void testAdd() {
//		MathOperations mOperations = new MathOperations();
		assertEquals(30, mOperations.add(10, 20));
	}

	@Test
	public void testAddForNegative() {
//		MathOperations mOperations = new MathOperations();
		assertEquals(-30, mOperations.add(-10, -20));
	}
	
//	@Test(expected=IllegalArguement.class)
//	public void testAddForException
//	{
//		mOperations.add(2000, 20);
//	}
	@Test
	public void testSub() {
//		MathOperations mOperations = new MathOperations();
		assertEquals(10, mOperations.sub(30, 20));
	}

	@Test
	public void testCheck() {
//		MathOperations mOperations = new MathOperations();
		assertTrue(mOperations.check("Kish"));
	}
	
	
	
	

}
