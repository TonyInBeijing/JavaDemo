package com.example.demo01.controller;

import com.example.demo01.domain.Video;
import com.example.demo01.service.VideoService;
import com.example.demo01.utils.JsonData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 视频控制器(RestController)
 */
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    //    @RequestMapping(value = "list", method = RequestMethod.GET)
    @GetMapping(value = "list")
    public Object list() throws JsonProcessingException {
        List<Video> list = videoService.listVideo();
//        将对象转化成Json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(list);
        System.out.println(jsonStr);
        System.out.println(1);
//        将字符串反序列化成对象
        List<Video> videoList = objectMapper.readValue(jsonStr,List.class);
        return JsonData.buildSuccess(videoList);
    }
}
