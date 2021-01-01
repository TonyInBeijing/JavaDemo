package com.example.demo01.service;

import com.example.demo01.domain.User;

import java.util.List;

public interface UserService {
    String login(String username, String pwd);
    List<User> listUser();
}
