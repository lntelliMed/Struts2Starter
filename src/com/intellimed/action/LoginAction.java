package com.intellimed.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

//public class LoginAction implements Action {
public class LoginAction extends ActionSupport {

	private String userId;
	private String password;
	
	//Instead of defining the below, you can just implement Action!
	//private static final String SUCCESS="success";
	//private static final String LOGIN="login";

	public void validate(){
		if (StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "User ID cannot be blank");
		}
		if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password", "Password cannot be blank");
		}
	}
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
