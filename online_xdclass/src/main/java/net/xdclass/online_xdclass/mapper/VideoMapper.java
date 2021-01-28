package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.domain.Video;

import java.util.List;

public interface VideoMapper {
    /**
     * 查询视频列表
     * @return
     */
    List<Video> listVideo();
}
