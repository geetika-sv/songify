package com.example.songify.controller;


import com.example.songify.model.Song;
import com.example.songify.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")

public class SongController {


    @Autowired
    private DatabaseService databaseService;

    @GetMapping
    public List<Song> getAllSongs() {
        return databaseService.getAllSongs();
    }

    @PostMapping
    public Song saveSong(@RequestBody Song song) {

        return databaseService.saveSong(song);
    }
}


