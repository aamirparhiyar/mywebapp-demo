package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String info() {
		return "this is default message!!!!!";
	}
	
	@GetMapping("/{name}")
	public String printMessage(@PathVariable String name) {
		return "Hi, " + name +" Welcome to my webapp";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "info_contact@support.com";
	}
}
