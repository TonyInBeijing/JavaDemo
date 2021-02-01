package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.domain.User;
import net.xdclass.online_xdclass.service.UserService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public JsonData register(@RequestBody Map<String, String> userInfo) {
        User user = userService.findByPhone(userInfo.get("phone"));
        if (user == null) {
            int rows = userService.save(userInfo);
            if (rows == 1) {
                return JsonData.buildSuccess();
            } else {
                return JsonData.buildError("注册失败");
            }
        } else {
            return JsonData.buildError(-1, "手机号已注册");
        }
    }
}
