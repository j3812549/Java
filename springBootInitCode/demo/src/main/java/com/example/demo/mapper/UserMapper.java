package com.example.demo.mapper;

import java.util.List;

import com.example.demo.core.mapper.MyMapper;
import com.example.demo.model.User;

public interface UserMapper extends MyMapper<User> {

  /**
   * 获取所有用户以及对应角色
   *
   * @return 用户列表
   */
  List<User> findAllUser();

}