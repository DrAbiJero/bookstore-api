package com.sample.bookstore.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sample.bookstore.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>
{

	String rawQuery = "select * from books where yearofpublication IN :yop";
	
	//@Query(nativeQuery = true , value = rawQuery)
	//List<Book> findAllByYearOfPublication(Set<Integer> yop);

	@Query(nativeQuery = true , value = rawQuery)
	List<Book> findAllByYearOfPublication(@Param("yop")Set<Integer> yop);


	
		
}
