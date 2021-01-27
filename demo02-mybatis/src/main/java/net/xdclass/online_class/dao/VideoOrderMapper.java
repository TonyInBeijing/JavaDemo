package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {
    /**
     * 查询全部订单
     * @return
     */
    List<VideoOrder> queryVideoOrderList();

    /**
     * 查询用户订单
     * @return
     */
    List<User> queryUserOrder();
}
