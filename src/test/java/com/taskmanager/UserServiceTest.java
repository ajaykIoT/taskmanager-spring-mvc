package com.taskmanager;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanager.model.Login;
import com.taskmanager.model.User;
import com.taskmanager.service.UserServiceImpl;


@ContextConfiguration("/user-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

  @Autowired
  UserServiceImpl userService;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testValidateUser() {

    Login login = new com.taskmanager.model.Login();
    login.setUsername("ajayk");
    login.setPassword("ajayk");

    User user = userService.validateUser(login);

    assertEquals("ajay", user.getFirstname());
  }

}
