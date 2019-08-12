package com.springfun.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String hello() { 
		return "Hello Human!";
	}
	@RequestMapping("/{name}")
	public String name(@PathVariable("name") String name) {
		return "Hello " + name + "!";
	}
	@RequestMapping("/{first_name}/{last_name}")
	public String fullname(@PathVariable("first_name") String first_name, @PathVariable("last_name") String last_name) {
		return "Hello " + first_name + " " + last_name + "!";
	}
}
