package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
    Video selectById(int videoId);

    // 查询全部视频列表
    @Select("select * from video")
    List<Video> selectList();

    // 根据评分和标题模糊查询
    Video selectByPointAndTitleLike(@Param("title") String title, @Param("point") double point);

    /**
     * 新增一条数据记录
     * @return
     */
    int add(Video video);

    /**
     * 批量插入
     * @param videoList
     * @return
     */
    int addBatch(List<Video> videoList);

    int selectVideoCount();

}
