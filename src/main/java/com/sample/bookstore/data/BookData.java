package com.sample.bookstore.data;

import java.util.List;

import com.sample.bookstore.entity.Book;

public class BookData 
{
	public List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
