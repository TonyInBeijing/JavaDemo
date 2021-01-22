package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class sqlSessionDemo {
    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis-config.xml";
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            Video video =  new Video();
            video.setTitle("小滴课堂面试专题900道");
            video.setCoverImg("xdclass.net/aaa.png");
            video.setPoint(9.4);
            video.setCreateTime(new Date());
            video.setPrice(9900);
            video.setSummary("这个是面试专题概要");
            videoMapper.add(video);
        }
    }
}
