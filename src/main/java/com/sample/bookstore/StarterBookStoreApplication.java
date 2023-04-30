package com.sample.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterBookStoreApplication 
{
	public static void main(String[] args)
	{
		SpringApplication.run(StarterBookStoreApplication.class, args);
		System.out.println("App Started");
	}
}
