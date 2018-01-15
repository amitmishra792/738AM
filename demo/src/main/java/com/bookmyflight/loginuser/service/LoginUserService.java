package com.bookmyflight.loginuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyflight.loginuser.dao.ILoginUserDao;
import com.bookmyflight.loginuser.entity.LoginUser;

@Service
public class LoginUserService implements ILoginUserService {
  @Autowired
  private ILoginUserDao loginUserDao;

  @Override
  public synchronized boolean loginAlreadyRegUser(LoginUser loginUser) {

    this.loginUserDao.loginAlreadyRegUser(loginUser);
    return true;

  }

}
