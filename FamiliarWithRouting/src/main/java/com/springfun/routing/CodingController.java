package com.springfun.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class CodingController {
	
	@RequestMapping("")
	public String hello() {
		
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String language1() {
		
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String language2() {
		
		return "Java/Spring is better!";
	}
	
}
