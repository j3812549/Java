package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping
  public Result GetUserById(@RequestParam(defaultValue = "0") final Integer page,
      @RequestParam(defaultValue = "10") final Integer pageSize) {
    return ResultGenerator.createOKResult(page);
  }

  @PutMapping
  public String PutUserById() {
    return "hello, put==user";
  }
}