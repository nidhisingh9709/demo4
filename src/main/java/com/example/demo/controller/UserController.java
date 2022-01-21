package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service1.IUserService;


@RestController
public class UserController {
	@Autowired
	IUserService userService;

	
	@GetMapping("/user")

	Iterable<User> getUsers() {

		return userService.getUsers();
	}
	

	@GetMapping("/user/{id}")
    

	@PostMapping("/user")

	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
	}

	@DeleteMapping("/user")
	void deleteUser() {
		System.out.println("deleted");
	}
}
