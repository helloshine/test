package com.xjw.boot.domain;

import java.io.Serializable;


public class User implements Serializable{

	private static final long serialVersionUID = 85851574536228465L;
	
	private String id;
	
	private String name;
	
	private int age;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
