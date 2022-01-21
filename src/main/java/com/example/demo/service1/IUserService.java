package com.example.demo.service1;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;

public class IUserService {
	
	@Autowired    //Dependency Injection
	UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	public Iterable<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
