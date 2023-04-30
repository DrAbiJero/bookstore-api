package com.sample.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book 
{
	@Id
	private Integer id;
	private String name;
	private String description;
	private Integer yearofpublication;
	private String type;
	
	public Book() {
		super();
	}

	public Book(Integer id, String name, String description, Integer yearofpublication, String type) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.yearofpublication = yearofpublication;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getYearofPublication() {
		return yearofpublication;
	}

	public void setYearofPublication(Integer yearofPublication) {
		this.yearofpublication = yearofPublication;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
