package com.intellimed.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	private String userId;
	private String password;
	
	//Instead of defining the below, you can just implement Action!
	//private static final String SUCCESS="success";
	//private static final String LOGIN="login";

	public String execute(){
		if (getUserId().equals("userId") && getPassword().equals("password")){
			return SUCCESS;
		}
		return LOGIN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
