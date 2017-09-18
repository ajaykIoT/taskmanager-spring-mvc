package com.taskmanager.dao;

import com.taskmanager.model.Login;
import com.taskmanager.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
