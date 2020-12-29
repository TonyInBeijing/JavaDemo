package com.example.demo01.service.impl;

import com.example.demo01.domain.Video;
import com.example.demo01.mapper.VideoMapper;
import com.example.demo01.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
