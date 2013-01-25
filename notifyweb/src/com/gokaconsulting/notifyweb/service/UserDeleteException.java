package com.gokaconsulting.notifyweb.service;

public class UserDeleteException extends Exception {

	private static final long serialVersionUID = 1L;
	private String user;
	
	public UserDeleteException(String u)
	{
		this.user = u;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
