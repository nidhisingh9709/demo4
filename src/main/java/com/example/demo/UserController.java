package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
@RestController
public class UserController {
	@GetMapping("/user")
	String getUser() {
	
      System.out.println("testing");
      return "testing";
}
	@PostMapping("/user")
	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println("Hello");
		//new things to be added
	}
	@DeleteMapping("/user")
	void deleteUser() {
		System.out.println("deleted");
	}
}