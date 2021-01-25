package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

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
            Video video1 = new Video();
            video1.setTitle("小滴课堂面试专题300道");
            video1.setCoverImg("xdclass.net/aaa.png");
            video1.setPoint(9.4);
            video1.setCreateTime(new Date());
            video1.setPrice(9900);
            video1.setSummary("这个是面试专题概要");

            Video video2 = new Video();
            video2.setTitle("小滴课堂面试专题400道");
            video2.setCoverImg("xdclass.net/bbb.png");
            video2.setPoint(8.0);
            video2.setCreateTime(new Date());
            video2.setPrice(2900);
            video2.setSummary("这个是面试专题概要2");

//            Video video3 = new Video();
//            video3.setTitle("测试视频1");
////            video3.setSummary("这是测试视频3");
//            video3.setId(66);
//            videoMapper.updateVideoSelective(video3);
//            sqlSession.commit();
//            System.out.println(video3.toString());

            Map<String, Object> map = new HashMap<>();
            map.put("createTime", "2021-01-11 09:33:20");
            map.put("price", 1000);
            int rows = videoMapper.deleteByCreateTimeAndPrice(map);
            sqlSession.commit();
            System.out.println(rows);

//            List<Video> list = new ArrayList<>();
//            list.add(video1);
//            list.add(video2);
//            int rows = videoMapper.addBatch(list);
//            sqlSession.commit();
//            System.out.println(rows);
//            System.out.println(list.toString());
        }
    }
}
