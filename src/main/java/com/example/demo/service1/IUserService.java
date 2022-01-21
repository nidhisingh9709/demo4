package com.example.demo.service1;

import java.util.Optional;

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
		return userRepository.findAll();
	}
	public Optional<User> getUser(Integer id){
		return userRepository.findById(id);
	}

	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	

}
