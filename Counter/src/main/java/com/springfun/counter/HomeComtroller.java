package com.springfun.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeComtroller {
	@RequestMapping("/your_server")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		
		Integer counter = (Integer) session.getAttribute("count");
		counter++;
		session.setAttribute("count", counter);
		model.addAttribute("counter", counter);
		return "index.jsp";
	}
	
	@RequestMapping("/two")
	public String two(Model model, HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer counter = (Integer) session.getAttribute("count");
		counter+=1;
		session.setAttribute("count", counter);
		model.addAttribute("counter", counter);
		return "redirect:/your_server";
	}
	
	@RequestMapping("/clear")
	public String clear(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer counter = (Integer) session.getAttribute("count");
		counter=0;
		session.setAttribute("count", counter);
		return "redirect:/counter";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("counter", count);
		return "counter.jsp";
	}
}
