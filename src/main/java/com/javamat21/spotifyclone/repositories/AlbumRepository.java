package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Long>,
        JpaRepository<Album, Long> {
}
