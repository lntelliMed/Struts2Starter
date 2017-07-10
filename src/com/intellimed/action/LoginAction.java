package com.intellimed.action;

import org.apache.commons.lang.StringUtils;

import com.intellimed.model.User;
import com.intellimed.service.LoginService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//public class LoginAction implements Action {
public class LoginAction extends ActionSupport implements ModelDriven<User> {

	//private String userId;
	//private String password;
	private User user = new User();
	
	//Instead of defining the below, you can just implement Action!
	//private static final String SUCCESS="success";
	//private static final String LOGIN="login";

	public void validate(){
		if (StringUtils.isEmpty(user.getUserId())) {
			//addFieldError("user.userId", "User ID cannot be blank");
			addFieldError("userId", "User ID cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			//addFieldError("user.password", "Password cannot be blank");
			addFieldError("password", "Password cannot be blank");
		}
	}
	public String execute(){
		LoginService loginService = new LoginService();
		//user = new User();
		//user.setUserId(userId);
		//user.setPassword(password);
		
		//if (getUserId().equals("userId") && getPassword().equals("password")){
		if (loginService.verifyLogin(user)){
			return SUCCESS;
		}
		return LOGIN;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public User getModel() {
		return user;
	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	
	
}
