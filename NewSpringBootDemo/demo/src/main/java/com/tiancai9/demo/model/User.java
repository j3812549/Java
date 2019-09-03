package com.tiancai9.demo.model;

public class User {
  private String id;
  private String name;

  public User() {
  }

  public User(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User id(String id) {
    this.id = id;
    return this;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + "}";
  }

}