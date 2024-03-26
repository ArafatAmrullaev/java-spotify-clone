package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.SongDTO;
import com.javamat21.spotifyclone.entities.Song;
import com.javamat21.spotifyclone.entities.Artist;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

public class SongMapperTest {

    private final SongMapper mapper = Mappers.getMapper(SongMapper.class);

    @Test
    void songToSongDto() {
        Song song = Song.builder()
                .id(1L)
                .title("Test Song")
                .artist(Artist.builder().id(1L).name("Test Artist").build())
                .build();

        SongDTO dto = mapper.songToSongDto(song);

        assertNotNull(dto);
        assertEquals(song.getId(), dto.getId());
        assertEquals(song.getTitle(), dto.getTitle());
        assertEquals("Test Artist", song.getArtist().getName());
    }
}
