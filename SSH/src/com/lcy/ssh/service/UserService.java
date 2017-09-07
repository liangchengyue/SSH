package com.lcy.ssh.service;

import java.util.List;

import com.lcy.ssh.pojo.User;

public interface UserService {
	public void addUser(User user) throws Exception;
	public List<User> getUsers() throws Exception;
	public User findUserById(String id) throws Exception;
}
