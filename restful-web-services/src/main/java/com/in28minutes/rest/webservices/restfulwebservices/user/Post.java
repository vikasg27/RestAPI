package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	
	@OneToMany(mappedBy = "post")
	private List<Department> department;
	
	
	
	public Post(List<Department> department) {
		super();
		this.department = department;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Post(Integer id, String description, User user, List<Department> department) {
		super();
		this.id = id;
		this.description = description;
		this.user = user;
		this.department = department;
	}
	
	
	

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Post [id=%s, description=%s]", id, description);
	}

	
}
