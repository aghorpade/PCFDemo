package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.User;
import com.example.springboot.entity.UserInputDTO;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public User GetUser(@PathVariable long userId){
		
		return userService.getUser(userId);
		
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public User GetUser(@RequestBody UserInputDTO userInputDTO){		
		
	 return	userRepo.save(new User(userInputDTO.getFirstName(),
				userInputDTO.getLastName(), userInputDTO.getUserName(), userInputDTO.getPassword(), userInputDTO.getEmailId()));
		
		
	}
	
	
}
