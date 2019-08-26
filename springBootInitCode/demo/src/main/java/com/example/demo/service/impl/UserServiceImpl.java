package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.core.service.AbstractService;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

  @Resource
  private UserMapper userMapper;

  @Override
  public List<User> findAllUser() {
    return this.userMapper.findAllUser();
  }

}