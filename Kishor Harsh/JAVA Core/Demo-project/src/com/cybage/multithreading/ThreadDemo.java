package com.cybage.multithreading;


class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
//			System.out.println("run method");
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		MyThread thread1=new MyThread("Thread1");
		MyThread thread2=new MyThread("Thread2");
		
		
		thread1.start();
		System.out.println("Status of thread_1 : "+thread1.isAlive());
		thread1.join();
		thread2.start();
		System.out.println("Status of thread_2 : "+thread1.isAlive());
		}

}
