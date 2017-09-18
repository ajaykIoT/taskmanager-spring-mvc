package com.taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmanager.dao.UserDao;
import com.taskmanager.model.Login;
import com.taskmanager.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
