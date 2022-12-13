package com.cybage.oop;

@FunctionalInterface		//
interface Greeting
{
//	public void greet();
//	public void greet(String msg);
	public String greet(String msg);

}

public class LambdaDemo {

	public static void main(String[] args)
	{
//		Greeting greeting=()->System.out.println("Hello from Lambda Expression");
//		both are valid if more number of line code then 
		
		
//		Greeting greeting=()->{
//			System.out.println("Hello from Lambda Expression");
//			System.out.println("Hello from Lambda Expression");
//		};
		
//		Greeting greeting=(String msg)->System.out.println(msg);
////		if it is single parameter then we can also use Greeting greeting=msg->Syso(msg);
		
		Greeting greeting=msg->{return msg;};
		System.out.println(greeting.greet("Hello from ujjwal"));
		
		
//		Greeting greeting=msg->msg;			also valid		first msg is parameter and second msg is returning the msg
	
//		greeting.greet("Hello from parameter");
	}
}
