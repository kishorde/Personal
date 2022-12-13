package com.cybage.multithreading;


class Shared
{
	int num;
	boolean flag=false;
	synchronized int get() throws InterruptedException
	{
		if(flag==false)
		{
			wait();
			
		}
		System.out.println(Thread.currentThread().getName()+" "+num);
		flag=false;
		notify();
		return num;
		
		
	}
	synchronized void put(int num) throws InterruptedException
	{
		if(flag==true)
		{
			System.out.println("Wating for consumer to consume data....");
			wait();
			
		}
		this.num=num;
		System.out.println(Thread.currentThread().getName()+" "+num);
		flag=true;
		notify();
	}
}

class Producer extends Thread
{
		Shared s;
		String name;
		public Producer(Shared s,String name) {
			super(name);
			this.s=s;
			
			this.start();
		}
		
		@Override
		public void run()
		{
			int i=0;
			while(true)
			{
				try {
					s.put(++i);
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


class Consumer extends Thread
{
	Shared s;
	String name;
	public Consumer(Shared s, String name)
	{
		super(name);
		this.s=s;
		this.start();
	}
	
	public void run()
	{
		while(true)
		{
			try {
				s.get();
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s=new Shared();
		new Producer(s,"Producer_1 : ");
		new Consumer(s,"Consumer_1 : ");
	}

}
