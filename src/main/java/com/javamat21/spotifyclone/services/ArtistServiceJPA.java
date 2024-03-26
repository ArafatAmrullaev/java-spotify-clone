package com.javamat21.spotifyclone.services;

import com.javamat21.spotifyclone.dto.ArtistDTO;
import com.javamat21.spotifyclone.mapper.ArtistMapper;
import com.javamat21.spotifyclone.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArtistServiceJPA implements ArtistService {

    private final ArtistMapper artistMapper;
    private final ArtistRepository artistRepository;

    @Override
    public Optional<ArtistDTO> getArtistById(Long id) {
        return Optional.ofNullable(
                artistMapper.artistToArtistDto(
                        artistRepository.findById(id)
                                .orElse(null)
                )
        );
    }
}
