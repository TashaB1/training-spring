package com.tashad16a.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TashaD on 21.10.2020.
 */
@Component
public class MusicPlayer {
    @Autowired
    private List<Music> musicList = new ArrayList<>();

    private String musicPlayList = "";

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        for (Music musicPlay: musicList) {
          musicPlayList = musicPlayList +  "Playing:" + musicPlay.getSong() + "; ";
        }
        return musicPlayList;
    }
}
