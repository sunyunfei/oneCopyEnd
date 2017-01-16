package com.bs.service.imp;

import com.bs.dao.MusicDao;
import com.bs.pojo.Music;
import com.bs.pojo.MusicComment;
import com.bs.pojo.MusicInfo;
import com.bs.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public class MusicServiceImp implements MusicService {

    @Autowired
    private MusicDao musicDao;

    //获取音乐信息
    @Override
    public List<MusicComment> queryInfo(Integer musicId) {

        return musicDao.queryInfo(musicId);
    }

    //获取音乐文章
    @Override
    public Music queryMusic(String userName) {
        return musicDao.queryMusic(userName);
    }

    //获取音乐信息
    public MusicInfo queryMusicInfo(Integer musicId){

        return musicDao.queryMusicInfo(musicId);
    }
}
