package com.web.azim;

public class User {
	int uid;
	String name;
	String username;
	String password;
	
	public User(String name, String username,String password) {
		this.name=name;
		this.username=username;
		this.password = password;
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name+"]";
	}
	
	

}
