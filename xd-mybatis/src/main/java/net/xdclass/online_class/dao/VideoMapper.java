package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;

// dao 与数据库交互
public interface VideoMapper {
    /**
     * 根据视频id查询视频对象
     *
     * @param videoId
     * @return
     */
    Video selectById(@Param("video_id") int videoId);
}
