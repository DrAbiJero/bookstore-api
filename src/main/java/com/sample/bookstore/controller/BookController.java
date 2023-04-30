package com.sample.bookstore.controller;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.bookstore.common.APIResponse;
import com.sample.bookstore.common.BadRequestException;
import com.sample.bookstore.entity.Book;
import com.sample.bookstore.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	//Display Book
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
		
		
	}
	
	// Insert Book
	@PostMapping("/createBooks")
	public Book insertBook(@RequestBody Book book)
	{
		return bookService.insertBook(book);
	}
	//Single Book Return
	@GetMapping("/books/{id}")
	public Optional<Book> getBookByID(@PathVariable("id") Integer id)
	{
		
		return bookService.getBookByID(id);
	}
	
	//Update Book
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book newbook)
	{
		return bookService.updateBook(newbook);
	}
	
	//Delete Book
		@DeleteMapping("/books/{id}")
		public void deleteBook(@PathVariable("id") Integer id)
		{
			bookService.deleteBook(id);
		}
	
		// Raw Query Get Book
		@GetMapping("/raw/books")
		public APIResponse getBooksByRawQuery(@RequestParam(value = "yop")Set<Integer> yop)
		{
			return bookService.getBooksByRawQuery(yop);
		}

}
