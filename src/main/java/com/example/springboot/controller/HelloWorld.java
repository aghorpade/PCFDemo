package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String helloworld(){
		
		return "Hello !! Welcome to amit's areana !!";
	}

}
