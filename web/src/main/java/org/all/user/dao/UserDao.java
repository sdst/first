package org.all.user.dao;

import javax.annotation.Resource;

import org.all.user.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao extends HibernateDaoSupport{
	@Resource
	public void setHibernateSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public void saveUser(User user){
		this.getHibernateTemplate().save(user);
	}
}
