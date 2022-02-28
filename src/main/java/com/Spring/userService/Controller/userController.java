package com.Spring.userService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Spring.userService.Entity.departmentEntity;
import com.Spring.userService.Entity.userEntity;

@RestController

public class userController {

	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/user")
	public userEntity user()
	{
		userEntity user=new userEntity(1,"naveen","scindia");
		return user;
		
	}
	
	
	@GetMapping("/user/depart")
	public departmentEntity depart()
	{   
		
		
		
		departmentEntity depart= restTemplate.getForObject("http://DEPARTMENTSERVICE/depart", departmentEntity.class);
		return depart ;
	}
	
	
}
