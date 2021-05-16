package com.in28minutes.rest.webservices.restfulwebservices.user;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int departmentId;
	
	
	private String description;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnore
	private Post post;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Department(int departmentId, String description, Post post) {
		super();
		this.departmentId = departmentId;
		this.description = description;
		this.post = post;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
