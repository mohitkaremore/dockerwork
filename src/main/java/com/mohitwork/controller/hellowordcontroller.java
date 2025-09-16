package com.mohitwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellowordcontroller {
	@GetMapping("/message")
	public String getmessage() {
		return "hi from mohit";
	}

}
