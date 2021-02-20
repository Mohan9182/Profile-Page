package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Index {

	@GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		return "index";
	}

}