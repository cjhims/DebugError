package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomController {

	//adding request mapping -- URl
	
		@RequestMapping("randomUrl")
		public String giveRandomMessage() {
			return "randomView"; //jsp file name
		}
}
