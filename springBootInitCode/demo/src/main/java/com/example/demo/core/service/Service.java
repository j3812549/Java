package com.example.demo.core.service;

import java.util.List;

/**
 * Service层基础接口，其他Service接口 请继承该接口
 */
public interface Service<T> {
  /**
   * 获取所有
   *
   * @return List<T>
   */
  List<T> findAll();
}