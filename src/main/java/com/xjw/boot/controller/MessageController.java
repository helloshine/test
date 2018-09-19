package com.xjw.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	

	
	@RequestMapping("/message")
	@ResponseBody
	public String hello() {
		
		return "message receive!!";
	}

}
