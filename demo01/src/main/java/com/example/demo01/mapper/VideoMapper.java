package com.example.demo01.mapper;

import com.example.demo01.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1, new Video(1, "Java基础1"));
        videoMap.put(2, new Video(2, "Java基础2"));
        videoMap.put(3, new Video(3, "Java基础3"));
        videoMap.put(4, new Video(4, "Java基础4"));
        videoMap.put(5, new Video(5, "Java基础5"));
    }

    public List<Video> listVideo() {
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
