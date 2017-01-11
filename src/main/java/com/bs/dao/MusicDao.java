package com.bs.dao;

import com.bs.pojo.Music;
import com.bs.pojo.MusicInfo;
import org.springframework.stereotype.Controller;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public interface MusicDao {

    //获取音乐信息
    MusicInfo queryInfo(Integer musicId);

    //获取音乐文章信息
    Music queryMusic(Integer musicId);
}
