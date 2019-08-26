package com.example.demo.core.service;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

public abstract class AbstractService<T> implements Service<T> {

  protected Mapper<T> mapper;

  @Override
  public List<T> findAll() {
    return this.mapper.selectAll();
  }
}