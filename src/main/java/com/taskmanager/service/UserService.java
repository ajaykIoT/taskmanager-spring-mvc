package com.taskmanager.service;

import com.taskmanager.model.Login;
import com.taskmanager.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
