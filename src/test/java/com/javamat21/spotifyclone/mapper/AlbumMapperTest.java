package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.AlbumDTO;
import com.javamat21.spotifyclone.entities.Album;
import com.javamat21.spotifyclone.entities.Artist;
import com.javamat21.spotifyclone.entities.Song;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumMapperTest {

    private final AlbumMapper mapper = Mappers.getMapper(AlbumMapper.class);

    @Test
    void albumToAlbumDto() {

        Song song1 = Song.builder().id(1L).title("Song 1").build();
        Song song2 = Song.builder().id(2L).title("Song 2").build();

        Album album = Album.builder()
                .id(1L)
                .title("Test Album")
                .artist(Artist.builder().id(1L).name("Test Artist").build())
                .songs(Arrays.asList(song1, song2))
                .build();

        AlbumDTO dto = mapper.albumToAlbumDto(album);

        assertNotNull(dto);
        assertEquals(album.getId(), dto.getId());
        assertEquals(album.getTitle(), dto.getTitle());
        assertEquals("Test Artist", album.getArtist().getName());
        assertEquals(album.getSongs().size(), dto.getSongs().size());
        assertEquals(album.getSongs().get(0).getTitle(), dto.getSongs().get(0).getTitle());
        assertEquals(album.getSongs().get(1).getTitle(), dto.getSongs().get(1).getTitle());
    }
}
