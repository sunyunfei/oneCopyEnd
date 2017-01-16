package com.bs.service;

import com.bs.pojo.Music;
import com.bs.pojo.MusicComment;
import com.bs.pojo.MusicInfo;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
public interface MusicService {
    //获取音乐信息
    List<MusicComment> queryInfo(Integer musicId);
    //获取音乐文章信息
    Music queryMusic(String userName);

    //获取音乐信息
    MusicInfo queryMusicInfo(Integer musicId);
}
