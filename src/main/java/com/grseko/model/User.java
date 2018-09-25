package com.grseko.model;

public class User {

  private String username;
  private String password; // TODO Don't store the password here - add authenticate(String password) method for that

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        ", username='" + this.username + '\'' +
        ", password='" + this.password + '\'' +
        '}';
  }
}
