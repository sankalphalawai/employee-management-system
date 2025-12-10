package com.spring.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmsController {
	@GetMapping("/")
	public String loadMain() {
		return "main.html";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add.html";
	}
	
	@GetMapping("/manage")
	public String manage() {
		return "view.html";
	}
	

}
