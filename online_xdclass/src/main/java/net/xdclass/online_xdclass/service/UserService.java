package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.domain.User;

import java.util.Map;

public interface UserService {

    User findByPhone(String phone);
    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int save(Map<String,String> userInfo);
}
