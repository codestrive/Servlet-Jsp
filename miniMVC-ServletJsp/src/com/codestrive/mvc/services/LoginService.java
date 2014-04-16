package com.codestrive.mvc.services;

import java.util.HashMap;

import com.codestrive.mvc.model.User;

public class LoginService {
	
	/*HashMap<String,String> users = new HashMap<String,String>();
	public LoginService(){
		users.put("codestrive", "code@strive");
		users.put("servlet", "servlet");
		users.put("mvcguru", "mvcguru");
	}*/
	
	public boolean authenticate(String userId,String password){
		
		String userName ="codestrive";
		String userPassword ="code@strive";
		
		if(userName.equals(userId) && userPassword.equals(password)){
			return true;
		}
		else{
			return false;
		}
	}
	
/*	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
	*/
	
}
