package com.lcy.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.lcy.ssh.dao.UserDao;
import com.lcy.ssh.pojo.User;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addUser(User user) throws Exception {
		sessionFactory.getCurrentSession().save(user);
	}

	public List<User> getUsers() throws Exception {
		String hql="from User";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	public User findUserById(String id) throws Exception {
		String hql="from User where id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		User user=(User) query.list().get(0);
		return user;
	}
}
