package com.cybage.basic;


class eg
{
	static int no_of_objects=0;
	public eg()
	{
		no_of_objects++;
	}
	
}
public class Count_of_object_creation {

	public static void main(String[] args) {
		eg one=new eg();
		eg two=new eg();
		eg three=new eg();
		eg four=new eg();
		eg fo=new eg();
		
		System.out.println(eg.no_of_objects);
		
		
	}

}
