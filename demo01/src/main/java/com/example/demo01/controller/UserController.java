package com.example.demo01.controller;

import com.example.demo01.domain.User;
import com.example.demo01.service.UserService;
import com.example.demo01.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("login")
    public JsonData login(@RequestBody User user) {
        System.out.println("user:" + user.toString());
        String token = userService.login(user.getUsername(), user.getPwd());
        return token != null ? JsonData.buildSuccess("") : JsonData.buldError("账号或密码错误");
    }

    /**
     * 用户列表
     * @return
     */
    @GetMapping("list_user")
    public JsonData listUser() {
        return JsonData.buildSuccess(userService.listUser());
    }
}
