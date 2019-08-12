package com.springfun.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}

//	@RequestMapping("/")
//	public String hello(@RequestParam(value = "fname", required = false) String first_name) {
//		if (first_name == null) {
//			return "Hello Human";
//		}else {
//			return "Hello " + first_name;
//		}
//	}
//	public String hello(@RequestParam(value = "fname", required = false) String first_name,@RequestParam(value = "lname", required = false) String last_name) {
//		return "Hello " +first_name + "" + last_name;
//		
//	}
	
}
