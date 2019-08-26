package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.core.response.Result;
import com.example.demo.core.response.ResultGenerator;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping
  public Result GetUserById(@RequestParam(defaultValue = "0") final Integer page,
      @RequestParam(defaultValue = "10") final Integer pageSize) {
    final List<User> list = this.userService.findAllUser();
    return ResultGenerator.createOKResult(list);
  }

  @PutMapping
  public String PutUserById() {
    return "hello, put==user";
  }
}