package com.lcy.ssh.dao;

import java.util.List;

import com.lcy.ssh.pojo.Type;

public interface TypeDao {
	public void addType(Type type) throws Exception;
	public List<Type> getTypes() throws Exception;
}
