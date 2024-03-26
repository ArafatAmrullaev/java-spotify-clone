package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Playlist;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.TransactionSystemException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlaylistRepositoryTest {
    @Autowired
    PlaylistRepository playlistRepository;

    @Test
    public void testNullNameArtistSave() {
        Playlist playlist = Playlist.builder().build();

        assertThrows(TransactionSystemException.class,
                () -> playlistRepository.save(playlist));
    }

    @Test
    @Transactional
    @Rollback
    public void testBlankNameArtistSave() {
        Playlist playlist = Playlist.builder()
                .name("  ")
                .build();

        assertThrows(ConstraintViolationException.class,
                () -> playlistRepository.saveAndFlush(playlist));
    }

}