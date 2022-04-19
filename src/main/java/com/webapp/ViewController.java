package com.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

	@GetMapping("/index")
	public String index(@RequestParam(value = "name"
		,defaultValue = "admin",required = true) String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
}
