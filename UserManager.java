package com.lti.training.day6.collections;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	private List<User> users;
	
	public UserManager() {
		users = new ArrayList<User>();
		users.add(new User("majrul", "123", false));
		users.add(new User("dinesh", "456", true));
		users.add(new User("gaurav", "789", true));
	}
	
	public boolean isValidUser(String username, String password) {
		for(User user : users)
			if(user.getUsername().equals(username))
				if(user.getPassword().equals(password))
					if(user.isActive())
						return true;
		return false;
	}
	
	public static void main(String[] args) {
		UserManager mgr = new UserManager();
		boolean isValid = mgr.isValidUser("majrul", "111");
		System.out.println(isValid);
	}
	
}
