package com.example.songify.service;

import com.example.songify.model.Song;
import com.example.songify.repository.SongRepository;
import com.example.songify.xray.XRayTimed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DatabaseService {
    @Autowired
    private SongRepository songRepository;

    @XRayTimed(segmentName = "DatabaseQuery")
    public List<Song> getAllSongs() {

        return songRepository.findAll();
    }

    @XRayTimed(segmentName = "SaveSong")
    public Song saveSong(Song song) {

        return songRepository.save(song);
    }
}
