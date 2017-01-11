package com.bs.service;

import com.bs.pojo.Music;
import com.bs.pojo.MusicInfo;

/**
 * Created by syf on 2017/1/8.
 */
public interface MusicService {
    //获取音乐信息
    MusicInfo queryInfo(Integer musicId);
    //获取音乐文章信息
    Music queryMusic(Integer musicId);
}
