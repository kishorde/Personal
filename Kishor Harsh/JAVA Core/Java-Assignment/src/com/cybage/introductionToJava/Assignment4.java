package com.cybage.introductionToJava;

class Account
{
	String name;
	int accNo;
	
	Account()
	{
		System.out.println("Welcome");
	}
	
	Account(String name,int accNo)
	{
		this.name=name;
		this.accNo=accNo;
	}
	
	String AccountInfo()
	{
		return "Name : "+name+", Account No : "+accNo;
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1=new Account("Kishor",102456);
		Account acc2=new Account("Kishor1",105456);
		Account acc3=new Account("Kishor2",122456);
		
		System.out.println(acc1.AccountInfo());
		System.out.println(acc2.AccountInfo());
		System.out.println(acc3.AccountInfo());
	}

}