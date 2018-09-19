package com.xjw.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjw.boot.domain.User;
import com.xjw.boot.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<User> getAll() {
		
		List<User> list = this.userService.getAll();
		
		return list;
	}
	
	@RequestMapping("/userInfo")
	public String userInfo() {
		
		return "userInfo";
	}

}
