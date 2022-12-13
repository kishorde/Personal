package com.cybage.multithreading;

class MyThread1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Curruntly running thread");
	}
}

public class RunnableDemo {
	public static void main(String[] args)
	{
//		Thread t=new Thread(new MyThread1(),"Demo Thread");
//		t.start();
		
		// using lambda Expression
//		Runnable runnable=()->System.out.println(Thread.currentThread().getPriority());	//runnable object
//		
//		Thread thread =new Thread(runnable,"Mythread");
//		thread.start();
		
		
		Runnable runnable1=()->
		{
//			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
			
			System.out.println(Thread.currentThread().getPriority());
		};
		
		Thread thread1 = new Thread (runnable1 , "MyThread_1");
		thread1.start();
		
	}

}
