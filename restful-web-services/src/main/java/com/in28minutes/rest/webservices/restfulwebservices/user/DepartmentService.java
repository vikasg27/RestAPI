package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public Department SavePost(Department department) {
		
		Department department1  =  new Department();
		Post post1  = new Post();
		//post1.setId(post1.getId());
		//post1.setDescription(department.getPost().getDescription());
		department1.setPost(post1);	
		department1.setDepartmentId(department.getDepartmentId());
		department1.setDescription(department.getDescription());
		

 return departmentRepository.save(department1);
		

		
	}


	public Department SavePostnew(Department department) {
		
		Department department1  =  new Department();
		Post post1  = new Post();
		//post1.setId(post1.getId());
		//post1.setDescription(department.getPost().getDescription());
		department1.setPost(post1);	
		department1.setDepartmentId(department.getDepartmentId());
		department1.setDescription(department.getDescription());
		

 return departmentRepository.save(department1);
 
 
 
	}
}


