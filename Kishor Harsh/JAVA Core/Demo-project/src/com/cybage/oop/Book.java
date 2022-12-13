package com.cybage.oop;

public class Book {

	private int ISB;
	private String title;
	private String author;
	
	
	public Book(int iSB, String title, String author) {
		super();
		ISB = iSB;
		this.title = title;
		this.author = author;
	}
	public int getISB() {
		return ISB;
	}
	public void setISB(int iSB) {
		ISB = iSB;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [ISB=" + ISB + ", title=" + title + ", author=" + author + "]";
	}
	
	@Override
	protected void finalize()
	{
		System.out.println("Finalize method of book");
	}

}
