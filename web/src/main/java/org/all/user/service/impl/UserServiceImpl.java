package org.all.user.service.impl;

import javax.annotation.Resource;

import org.all.user.dao.UserDao;
import org.all.user.domain.User;
import org.all.user.service.UserService;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

}
