package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.ArtistDTO;
import com.javamat21.spotifyclone.entities.Artist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ArtistMapper {
    ArtistDTO artistToArtistDto(Artist artist);
    Artist artistDtoToArtist(ArtistDTO dto);

}
