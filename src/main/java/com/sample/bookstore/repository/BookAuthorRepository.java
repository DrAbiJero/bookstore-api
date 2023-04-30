package com.sample.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.bookstore.entity.BookAuthor;

public interface BookAuthorRepository extends CrudRepository<BookAuthor,Long> {

}
