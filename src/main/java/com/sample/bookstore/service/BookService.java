package com.sample.bookstore.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bookstore.common.APIResponse;
import com.sample.bookstore.common.BadRequestException;
import com.sample.bookstore.common.Errors;
import com.sample.bookstore.data.BookData;
import com.sample.bookstore.entity.Book;
import com.sample.bookstore.repository.BookRepository;
import com.sample.bookstore.validator.BookValidator;

@Service
public class BookService 
{
//		static List<Book>booklist = Arrays.asList(
//			new Book(1,"Two States","Tale of Two States",2007,"Fiction"),
//			new Book(2,"Audltery","Thought Process of a Woman in her 30s",2010,"Monologue Fiction"),
//	
	//Single Ton new Book(3,"Alchemist","Reactions of Chemical",2007,"Sci-Novel"));

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookValidator bookValidator;
	
	//Get Api
	
	public List<Book> getAllBooks()
	{
		List<Book> booklist = new ArrayList<>(); 
		
		bookRepository.findAll().forEach(booklist::add);
		return booklist;
	}
	
	
	
	public Book insertBook(Book book) 
	{
		
		List<Errors> errors =bookValidator.validateInsertBookRequest(book);
		if(errors.size()>0)
		{
			
			throw new BadRequestException("Bad Request",errors);
			
		}
		return bookRepository.save(book);
	}

	public Optional<Book> getBookByID(Integer id) {
		
		return bookRepository.findById(id);
	}

	public Book updateBook(Book book) {
		
		return bookRepository.save(book);
	}



	public void deleteBook(Integer id) {
		
		bookRepository.deleteById(id);
	}


	public APIResponse getBooksByRawQuery(Set<Integer> yop) {
		
		APIResponse apiResponse = new APIResponse();
		
		//DB Call 
		
		List<Book> booklist = bookRepository.findAllByYearOfPublication(yop);
//		Map<String, List<Book>> data = new HashMap<>(); 
//		data.put("books", booklist);
		
		
		//Set Data
		BookData bookData = new BookData();
		bookData.setBooks(booklist);
		//bookData.setBook(null);
		
		// Set Api Response 
		//apiResponse.setError(300);
		
		apiResponse.setData(bookData);
		return apiResponse;
	}

	



	
	

}
