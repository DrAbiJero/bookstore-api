package com.sample.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.DateTime;

@Entity
public class Author 
{
	@Id
	private Long id;
	private String name;
	private String gender;
	private DateTime createdAt;
	private DateTime updatedAt;
	
	public Author() {
		super();
	}

	public Author(Long id, String name, String gender, DateTime createdAt, DateTime updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	

}
