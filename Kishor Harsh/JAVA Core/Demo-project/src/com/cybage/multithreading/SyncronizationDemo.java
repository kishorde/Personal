package com.cybage.multithreading;

class First
{
	public synchronized void display(String msg)
	{
		System.out.print("[ "+msg );
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();			
		}
		System.out.println(" ]");
	}
}

class second extends Thread
{
	String msg;
	First first;
	second (First first,String msg)
	{
		this.first=first;
		this.msg=msg;
		start();
		
	}
	
	public void run()
	{
		 first.display(msg);
	}
}


public class SyncronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first=new First();
		second s1=new second(first,"Welcome");
		second s2=new second(first,"new");
		second s3=new second(first,"programmer");
			
	}

}
