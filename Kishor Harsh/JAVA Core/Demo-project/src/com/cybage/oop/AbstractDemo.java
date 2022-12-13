package com.cybage.oop;

abstract class Shape
{
	int l,b;
	Shape(int x,int y)
	{
		this.l = x;
		this.b = y;
	}
	
	// abstract method (alwalys use abstract keyword before class)
	abstract public void area();
	
	
}

class Rectangle extends Shape
{
	
	Rectangle(int l,int b)
	{
		super(l,b);
	}
	@Override
	public void area()
	{
		System.out.println("Area of Rectangle :"+(l*b));
	}
}

class Triangle extends Shape
{
	Triangle(int l,int b)
	{
		super(l,b);
	}
	public void area()
	{
		System.out.println("Area of Triangle :"+0.5*(l*b));
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape area1=new Rectangle(12,5);
		area1.area();
		
		Shape area2=new Triangle(15,5);
		area2.area();
		
//		area2.l=12;
//		area2.b=10;
//		area2.area();
		

	}

}
