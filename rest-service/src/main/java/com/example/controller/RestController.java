package com.example.controller;



import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
