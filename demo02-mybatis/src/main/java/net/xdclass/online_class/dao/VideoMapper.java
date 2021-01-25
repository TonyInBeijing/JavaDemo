package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {
    Video selectById(int videoId);

    // 查询全部视频列表
    @Select("select * from video")
    List<Video> selectList();

    // 根据评分和标题模糊查询
    Video selectByPointAndTitleLike(@Param("title") String title, @Param("point") double point);

    /**
     * 新增一条数据记录
     *
     * @return
     */
    int add(Video video);

    /**
     * 批量插入
     *
     * @param videoList
     * @return
     */
    int addBatch(List<Video> videoList);

    /**
     * 更新
     *
     * @param video
     * @return
     */
    int updateVideo(Video video);

    /**
     * 选择性更新
     *
     * @param video
     * @return
     */
    int updateVideoSelective(Video video);

    /**
     * 选择性删除
     *
     * @return
     */
    int deleteByCreateTimeAndPrice(Map<String, Object> map);

    int selectVideoCount();

}
