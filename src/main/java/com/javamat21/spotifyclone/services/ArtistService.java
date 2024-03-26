package com.javamat21.spotifyclone.services;

import com.javamat21.spotifyclone.dto.ArtistDTO;

import java.util.Optional;

public interface ArtistService {
    Optional<ArtistDTO> getArtistById(Long id);
}
