package com.firstproject.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public HelloController() { }
    @GetMapping("/hello")
	public String greet(){
		return "Hello there, how u doin?";
	}
}
