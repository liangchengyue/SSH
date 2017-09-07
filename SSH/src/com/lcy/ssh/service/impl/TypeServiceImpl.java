package com.lcy.ssh.service.impl;

import java.util.List;

import com.lcy.ssh.dao.TypeDao;
import com.lcy.ssh.pojo.Type;
import com.lcy.ssh.service.TypeService;

public class TypeServiceImpl implements TypeService{
	private TypeDao typeDao;

	
	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}


	public void addType(Type type) throws Exception {
		typeDao.addType(type);
		
	}


	@Override
	public List<Type> getTypes() throws Exception {
		return typeDao.getTypes();
	}

}
