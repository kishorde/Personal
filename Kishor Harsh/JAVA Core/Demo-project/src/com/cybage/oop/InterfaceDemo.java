package com.cybage.oop;

interface MathOperation
{
	float PI=3.14f;
//	abstract public void add(int n1,int n2); 	// both are valid we can use abstract keyword otherwise by default it is abstract
	public void add(int n1,int n2);
	public void sub(int n1,int n2);		//when we add method in interface we have to provide implementation in subclass

	default void multiplication(int n1,int n2)
	{
		System.out.println("Mul :"+(n1*n2));
	}
	
	default void division(int n1,int n2)
	{
		System.out.println("Div :"+(n1/n2));
	}
	
	static void greet()
	{
		System.out.println("Good Morning!");
	}
}

class Calculator implements MathOperation
{
	public void add(int n1,int n2)
	{
		System.out.println("Sum : "+(n1+n2));
	}
	
	public void sub(int n1,int n2)
	{
		System.out.println("Sub :"+(n1-n2));
	}
	
	@Override
	public void multiplication(int n1,int n2)
	{
		System.out.println("Multiplication in subclass :"+(n1*n2));
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal=new Calculator();
		cal.add(5, 15);
		
		
		MathOperation mopp=new Calculator();
		mopp.add(20, 30);
		
		mopp.sub(100,20);
		
//		mopp.PI=3.145f;		// we cant change the value of variables in interface;

		System.out.println(MathOperation.PI);	//static method
		mopp.multiplication(4, 50);
		
		System.out.println(MathOperation.PI);
	
		mopp.division(50, 2);
		
		mopp.multiplication(4, 6);
		MathOperation.greet();
		
		MathOperation.
		
		
	}

}
