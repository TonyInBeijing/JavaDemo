package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 根据手机号查询用户
     *
     * @param phone
     * @return
     */
    User findByPhone(@Param("phone") String phone);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int save(User user);

    User findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);
}
