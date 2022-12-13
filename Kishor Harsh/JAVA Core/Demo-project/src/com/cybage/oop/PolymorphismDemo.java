package com.cybage.oop;

class A
{
//	int m,n;
//	
//	A(int m,int n)
//	{
//		this.m=m;
//		this.n=n;
//	}
//	
	public void display()
	{
		System.out.println("Class A's display method");
	}
}

class B extends A
{
//	int p;
//	B(int m,int n,int p)
//	{
//		super(m,n);
//		this.p=p;
//	}
	
	@Override
	public void display()
	{
		System.out.println("Class B's display method");
	}
	
	
}


public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A a=new A();
//		a.display();
		
		B b=new B();
		b.display();
//		
		A a1=new B();
		a1.display();
	}

}
