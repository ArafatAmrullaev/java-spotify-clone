package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.ArtistDTO;
import com.javamat21.spotifyclone.entities.Artist;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

public class ArtistMapperTest {

    private final ArtistMapper mapper = Mappers.getMapper(ArtistMapper.class);

    @Test
    void artistToArtistDto() {
        Artist artist = Artist.builder()
                .id(1L)
                .name("Test Artist")
                .build();

        ArtistDTO dto = mapper.artistToArtistDto(artist);

        assertNotNull(dto);
        assertEquals(artist.getId(), dto.getId());
        assertEquals(artist.getName(), dto.getName());
    }

//    @Test
//    void artistDtoToArtist() {
//        Artist artist = Artist.builder()
//                .id(1L)
//                .name("Test Artist")
//                .build();
//
//        Artist artist = mapper.artistDtoToArtist(dto);
//
//        assertNotNull(artist);
//        assertEquals(dto.getId(), artist.getId());
//        assertEquals(dto.getName(), artist.getName());
//    }
}
