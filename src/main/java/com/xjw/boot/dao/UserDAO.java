package com.xjw.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xjw.boot.domain.User;

@Mapper
public interface UserDAO {
	List<User> getAll();
}
