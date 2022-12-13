package com.cybage.oop;

interface Vehicle
{
	public void applyBreak();
	public void color();
	
	
	default void changeGear()
	{
		System.out.println("Gear changed!!");
	}
	
	static void applyHorn()
	{
		System.out.println("Horn Blowed!!");
	}
}

class Bike implements Vehicle
{
	public void applyBreak()
	{
		System.out.println("Bike Break!!!");
	}
	
	
	@Override
	public void changeGear()
	{
		System.out.println("Gear Changed");
	}


	@Override
	public void color() {
		System.out.println("Bike color: Black");
		
	}
}





class Car implements Vehicle
{
	public void color()
	{
		System.out.println("Car Color : Red");
	}

	@Override
	public void applyBreak() {
		System.out.println("Car Break!!");
		
	}
}






public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicleBike=new Bike();
		
		vehicleBike.applyBreak();
		vehicleBike.changeGear();
		
		Vehicle.applyHorn();
		
		vehicleBike.changeGear();
		
		
		
		Vehicle vehicleCar=new Car();
		
		vehicleCar.applyBreak();
		vehicleCar.changeGear();
		
		
		
		
		
		
		

	}

}
