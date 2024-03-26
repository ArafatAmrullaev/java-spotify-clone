package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlaylistRepository extends CrudRepository<Playlist,Long>,
        JpaRepository<Playlist, Long> {
}

