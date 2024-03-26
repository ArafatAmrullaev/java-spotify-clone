package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Long>,
        JpaRepository<Song, Long> {
}
