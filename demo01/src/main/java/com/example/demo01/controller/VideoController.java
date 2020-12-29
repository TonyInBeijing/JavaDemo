package com.example.demo01.controller;

import com.example.demo01.domain.Video;
import com.example.demo01.service.VideoService;
import com.example.demo01.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 视频控制器(RestController)
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    //    @RequestMapping(value = "list", method = RequestMethod.GET)
    @GetMapping(value = "list")
    public Object list() {
        List<Video> list = videoService.listVideo();
        return JsonData.buildSuccess(list);
    }
}
