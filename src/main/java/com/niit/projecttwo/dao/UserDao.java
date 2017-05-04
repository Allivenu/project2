package com.niit.projecttwo.dao;

import com.niit.projecttwo.model.User;

public interface UserDao {

	 User registerUser(User user);
	 User login(User user);
	 void updateUser(User user);
	 User getUser(int id);
}
