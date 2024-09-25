package com.loginregistration.service;

import java.sql.Date;

import com.loginregistration.dao.UserDao;
import com.loginregistration.dao.UserDaoImpl;
import com.loginregistration.model.User;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();

	@Override
	public User login(String username, String password) {
		User user = this.get(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}
		return null;
	}

	@Override
	public User get(String username) {
		return userDao.get(username);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean register(String username, String password, String email, String fullname, String phone) {
		long millis = System.currentTimeMillis();
		Date currentDate = new java.sql.Date(millis);
		User user = new User();
		user.setEmail(email);
		user.setUserName(username);
		user.setFullName(fullname);
		user.setPassWord(password);
		user.setImages("Mac Dinh");
		user.setRoleid(1);
		user.setPhone(phone);
		user.setCreatedDate(currentDate);
		try {
			userDao.insert(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		System.out.println(userService.get("quocbao12"));
	}
}