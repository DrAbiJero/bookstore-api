package com.sample.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.bookstore.entity.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>
{

}
