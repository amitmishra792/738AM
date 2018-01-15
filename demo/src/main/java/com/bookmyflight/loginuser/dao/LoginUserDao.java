package com.bookmyflight.loginuser.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookmyflight.loginuser.entity.LoginUser;

@Transactional
@Repository
public class LoginUserDao implements ILoginUserDao {
  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public void loginAlreadyRegUser(LoginUser user) {

    this.entityManager.persist(user);
  }

}
