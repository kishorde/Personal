package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Book;

public class BookService {

	List<Book> bookList=new ArrayList<>();
	
	public BookService()
	{
		bookList.add(new Book(101,"Rich Dad Poor Dad","author","publisher"));
		bookList.add(new Book(102,"Atomic Habit","author","publisher"));
		bookList.add(new Book(103,"Startup","author","publisher"));
		bookList.add(new Book(104,"CA","author","publisher"));
	}
	
	public List<Book> getAllBookList()
	{
		return bookList;
	}
	
	public Book getBookById(int id)
	{
		 Book book1=bookList.stream().filter(book->book.getBookId()==id).findFirst().get();
		 return book1;
	}
	
	
	public void addBook(Book book)
	{
		bookList.add(book);
	}
	
	public void deleteBook(int id)
	{
		Book book=getBookById(id);
		bookList.remove(book);
		
	}
	
	public void updateBook(Book book)
	{
		Book book1=getBookById(book.getBookId());
		int index=bookList.indexOf(book1);
		bookList.set(index, book);
		
	}
	
}