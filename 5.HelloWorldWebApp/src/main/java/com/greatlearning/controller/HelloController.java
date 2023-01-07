package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //stereotype annotation of @Component 
public class HelloController {

	//adding request mapping -- URl
	
	@RequestMapping("/")
	public String giveWelcomeMessage() {
		return "welcome"; //jsp file name
	}
	
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";
	}
	
	@RequestMapping("/goodbye")
	public String giveGoodByeMessage() {
		return "goodbye";
	}
}
