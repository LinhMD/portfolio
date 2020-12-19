package com.example.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	@ResponseBody
	public String hello(){
		return "hello world";
	}
}
