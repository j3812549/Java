package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;

@RestController
@RequestMapping("/user/aa")
public class UserController {
  
  @GetMapping
  public User GetUserById () {
    User user = new User();
    return user;
  }

  @PutMapping
  public String PutUserById () {
    return "hello, put==user";
  }
}