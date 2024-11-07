package com.loginregistration.dao;

import java.util.List;
import com.loginregistration.model.User;

public interface UserDao{
	void insert(User user);
	void updatePassword(String username, String newPassword);
	List<User> findAll();
	User get(String username);
	User findById(int id);
	User findByEmail(String email);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}