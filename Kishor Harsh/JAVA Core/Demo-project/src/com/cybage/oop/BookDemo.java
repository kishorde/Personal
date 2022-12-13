package com.cybage.oop;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(1011,"C","Yashwant kanetkar");

		System.out.println(book);
//		System.out.println(book.getAuthor());
//		
//		book.setTitle("\"C Book\"");
//		
//		System.out.println(book.toString());
		
//		book=null;		if book is null then system.gc() will call finalize method
		
		System.gc();	//for calling finalize method
		
		
		
	}

}
