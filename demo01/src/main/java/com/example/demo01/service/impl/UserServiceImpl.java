package com.example.demo01.service.impl;

import com.example.demo01.domain.User;
import com.example.demo01.mapper.UserMapper;
import com.example.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static Map<String, User> sessionMap = new HashMap<>();
    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String pwd) {
        User user = userMapper.login(username, pwd);
        if (user == null) {
            return null;
        } else {
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token, user);
            return token;
        }
    }
}
