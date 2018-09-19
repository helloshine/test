package com.xjw.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjw.boot.domain.User;

@Controller
public class HelloController {
	
	@Autowired
    protected RedisTemplate redisTemplate;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		
		redisTemplate.opsForValue().set("myname", "xiangjunwei");
		String name = (String) redisTemplate.opsForValue().get("myname");
		System.out.println(name);
		
		User u = new User();
		u.setId("id1111");
		u.setName("项俊伟");
		u.setAge(31);
		return u;
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "hello springboot111";
	}

}
