package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.PlaylistDTO;
import com.javamat21.spotifyclone.entities.Playlist;
import com.javamat21.spotifyclone.entities.Song;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PlaylistMapperTest {

    private final PlaylistMapper mapper = Mappers.getMapper(PlaylistMapper.class);

    @Test
    void playlistToPlaylistDto() {

        Song song1 = Song.builder().id(1L).title("Song 1").build();
        Song song2 = Song.builder().id(2L).title("Song 2").build();

        Playlist playlist = Playlist.builder()
                .id(1L)
                .name("Test Playlist")
                .songs(Arrays.asList(song1, song2))
                .build();

        PlaylistDTO dto = mapper.playlistToPlaylistDto(playlist);

        assertNotNull(dto);
        assertEquals(playlist.getId(), dto.getId());
        assertEquals(playlist.getName(), dto.getName());
        assertEquals(playlist.getSongs().size(), dto.getSongs().size());
        assertEquals(playlist.getSongs().get(0).getTitle(), dto.getSongs().get(0).getTitle());
        assertEquals(playlist.getSongs().get(1).getTitle(), dto.getSongs().get(1).getTitle());
    }
}
