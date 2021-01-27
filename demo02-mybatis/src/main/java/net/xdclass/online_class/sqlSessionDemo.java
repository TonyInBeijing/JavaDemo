package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.dao.VideoOrderMapper;
import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.Video;
import net.xdclass.online_class.domain.VideoOrder;
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
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
            /**
             * 增
             */
//            Video video1 = new Video();
//            video1.setTitle("小滴课堂面试专题300道");
//            video1.setCoverImg("xdclass.net/aaa.png");
//            video1.setPoint(9.4);
//            video1.setCreateTime(new Date());
//            video1.setPrice(9900);
//            video1.setSummary("这个是面试专题概要");
//            int row = videoMapper.add(video1);
//            sqlSession.commit();
//            System.out.println(row);
            // 增加多条
//            List<Video> list = new ArrayList<>();
//            list.add(video1);
//            list.add(video1);
//            int rows1 = videoMapper.addBatch(list);
//            sqlSession.commit();
//            System.out.println(rows1);
//            System.out.println(list.toString());

            /**
             * 删
             */
//            Map<String, Object> map = new HashMap<>();
//            map.put("createTime", "2021-01-11 09:33:20");
//            map.put("price", 1000);
//            int rows2 = videoMapper.deleteByCreateTimeAndPrice(map);
//            sqlSession.commit();
//            System.out.println(rows2);

            /**
             * 改
             */
//            Video video3 = new Video();
//            video3.setTitle("测试视频1");
//            video3.setSummary("这是测试视频3");
//            video3.setId(66);
//            videoMapper.updateVideoSelective(video3);
//            sqlSession.commit();
//            System.out.println(video3.toString());
//
            /**
             * 查
             */
//            Video video2 = videoMapper.selectById(66);
//            System.out.println(video2.toString());
            // resultMap association一对一关联查询
//            List<VideoOrder> videoOrders = videoOrderMapper.queryVideoOrderList();
//            System.out.println(videoOrders.toString());
            // resultMap collection一对多关联查询
            List<User> userList = videoOrderMapper.queryUserOrder();
            System.out.println(userList);
        }
    }
}
