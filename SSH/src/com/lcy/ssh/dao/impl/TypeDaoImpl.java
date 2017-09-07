package com.lcy.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.lcy.ssh.dao.TypeDao;
import com.lcy.ssh.pojo.Type;

public class TypeDaoImpl implements TypeDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addType(Type type) throws Exception {
		sessionFactory.getCurrentSession().save(type);
	}
	@Override
	public List<Type> getTypes() throws Exception {
		String hql="from Type";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
