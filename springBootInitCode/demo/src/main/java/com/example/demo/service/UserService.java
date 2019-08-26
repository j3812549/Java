package com.example.demo.service;

import java.util.List;

import com.example.demo.core.service.Service;
import com.example.demo.model.User;

public interface UserService extends Service<User> {
  /**
   * 获取所有用户
   * @return 用户列表
   */
  List<User> findAllUser();
}