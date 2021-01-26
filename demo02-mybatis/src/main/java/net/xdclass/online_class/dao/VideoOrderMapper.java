package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {
    /**
     * 查询全部订单
     * @return
     */
    List<VideoOrder> queryVideoOrderList();
}