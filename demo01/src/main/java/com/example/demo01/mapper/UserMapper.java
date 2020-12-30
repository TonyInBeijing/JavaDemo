package com.example.demo01.mapper;

import com.example.demo01.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("jack", new User(1, "jack", "123"));
        userMap.put("tom", new User(2, "tom", "456"));
        userMap.put("tony", new User(3, "tony", "789"));
    }

    public User login(String username, String pwd) {
        User user = userMap.get(username);
        if (user == null) {
            return null;
        }
        if (user.getPwd().equals(pwd)) {
            return user;
        }
        return null;
    }

}
