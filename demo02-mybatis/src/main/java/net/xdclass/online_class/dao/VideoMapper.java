package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    Video selectById(@Param("video_id") int Id);
}
