package com.lcy.ssh.dao;

import java.util.List;

import com.lcy.ssh.pojo.User;

public interface UserDao{
	public void addUser(User user) throws Exception;
	public List<User> getUsers() throws Exception;
	public User findUserById(String id) throws Exception;
}
