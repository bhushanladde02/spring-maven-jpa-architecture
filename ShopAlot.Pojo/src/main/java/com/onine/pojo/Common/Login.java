package com.onine.pojo.Common;

public class Login {
	long id;
	String username;
	String Password;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Login(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		Password = password;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
	

}
