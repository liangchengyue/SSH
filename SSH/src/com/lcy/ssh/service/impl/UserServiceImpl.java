package com.lcy.ssh.service.impl;

import java.util.List;

import com.lcy.ssh.dao.UserDao;
import com.lcy.ssh.pojo.User;
import com.lcy.ssh.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) throws Exception {
		userDao.addUser(user);
	}

	public List<User> getUsers() throws Exception {
		return userDao.getUsers();
	}

	public User findUserById(String id) throws Exception {
		return userDao.findUserById(id);
	}

}
