package com.sample.bookstore.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sample.bookstore.common.Errors;
import com.sample.bookstore.entity.Book;

@Component
public class BookValidator {

	public List<Errors> validateInsertBookRequest(Book book) 
	{
		List<Errors> errors = new ArrayList<>();
		
		if(book.getName()==null)
		{
			Errors error = new Errors("name","Book name is null");
			errors.add(error);
		}
		
		if(book.getYearofPublication()==null)
		{
			Errors error = new Errors("yearofpublication","Yop is null");
			errors.add(error);
		}
		
		return errors;
	}

}
