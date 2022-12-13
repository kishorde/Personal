package com.cybage.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
	
	@Min(100)
	@Max(1000)
	private int bookId;
	
	@NotEmpty
	@Size(min=2,max=20)	
	private String bookTitle;
	@NotEmpty
	@Size(min=2,max=20)
	private String bookAuthor;
	@NotEmpty
	@Size(min=2,max=20)
	private String bookPublisher;
	
	public Book()
	{
		
	}
	
	public Book(int bookId,String bookTitle,String bookAuthor,String bookPublisher) 
	{
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	
	
}
