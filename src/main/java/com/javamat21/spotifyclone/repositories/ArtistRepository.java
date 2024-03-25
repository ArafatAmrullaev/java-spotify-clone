package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist,Long>,
        JpaRepository<Artist, Long> {
}
