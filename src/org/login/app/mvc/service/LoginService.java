package org.login.app.mvc.service;

import java.util.HashMap;

import org.login.app.mvc.dto.User;

public class LoginService {

	// simulate DB models data
	private HashMap<String, String> users = new HashMap<String, String>();

	public LoginService() {
		users.put("admin", "Milos Dragovic");
		users.put("optiumus", "Petar Petrovic");
		users.put("hrkljus", "Zika Zikic");
	}

	public boolean authenticate(String userId, String password) {
		// simple authenticate... simulate of real checking credentials from database
		if (password == null || password.trim() == "") {
			return false;
		}
		return true;
	}

	// Here User as return type, represent "Model" in our pattern and in
	// real-scenario it should be get from DB
	public User getUserDetails(String userId) {
		User user = new User();
		System.out.println(users.get(userId));
		user.setUsername(users.get(userId));
		user.setUserId(userId);
		System.out.println("LoginService: username back from user "+user.getUsername());
		return user;
	}
}
