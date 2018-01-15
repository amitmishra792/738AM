package com.bookmyflight.loginuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.bookmyflight.loginuser.entity.LoginUser;
import com.bookmyflight.loginuser.service.ILoginUserService;

@Controller
@RequestMapping("loginUser")
@CrossOrigin(origins = { "http://localhost:4200" })
public class LoginUserController {

  @Autowired
  private ILoginUserService loginUserService;

  @PostMapping("loginAlreadyRegUser")
  public ResponseEntity<Void> loginAlreadyRegUser(@RequestBody LoginUser loginUser, UriComponentsBuilder builder) {

    System.out.println("loginUser ID : " + loginUser.getUserId());
    System.out.println("loginUser Email : " + loginUser.getEmail());
    System.out.println("loginUser Password : " + loginUser.getPassword());

    boolean flag = this.loginUserService.loginAlreadyRegUser(loginUser);
    if (flag == false) {
      return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    }
    HttpHeaders headers = new HttpHeaders();
    headers.setLocation(builder.path("/createUser?email={email}").buildAndExpand(loginUser.getEmail()).toUri());
    return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
  }

}