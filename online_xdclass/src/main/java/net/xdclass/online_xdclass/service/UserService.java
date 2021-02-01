package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.User;

import java.util.Map;

public interface UserService {

    User findByPhone(String phone);

    /**
     * 新增用户
     *
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);

    /**
     * 登录
     * @param phone
     * @param pwd
     * @return
     */
    String findByPhoneAndPwd(String phone, String pwd);
}
