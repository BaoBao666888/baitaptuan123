package com.loginregistration.dao;

import java.util.List;
import com.loginregistration.model.User;

public interface UserDao{
	void insert(User user);
	List<User> findAll();
	User get(String username);
	User findById(int id);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}