package com.tiancai9.demo.controller;

import javax.websocket.server.PathParam;

import com.tiancai9.demo.core.response.Result;
import com.tiancai9.demo.core.response.ResultGenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping
  public Result GetUser(@PathParam(value = "id") String id, @PathParam(value = "name") String name) {
    return ResultGenerator.createOKResult();
  }
}