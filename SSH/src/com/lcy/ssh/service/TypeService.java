package com.lcy.ssh.service;

import java.util.List;

import com.lcy.ssh.pojo.Type;

public interface TypeService {
	public void addType(Type type) throws Exception;
	public List<Type> getTypes() throws Exception;
}
