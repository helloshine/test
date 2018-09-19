package com.xjw.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjw.boot.dao.UserDAO;
import com.xjw.boot.domain.User;
import com.xjw.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public List<User> getAll() {
		List<User> list = this.userDAO.getAll();
		return list;
	}

}
