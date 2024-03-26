package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Artist;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.TransactionSystemException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArtistRepositoryTest {
    @Autowired
    ArtistRepository artistRepository;

    @Test
    public void testNullNameArtistSave() {
        Artist artist = Artist.builder().build();

        assertThrows(TransactionSystemException.class,
                () -> artistRepository.save(artist));
    }

    @Test
    @Transactional
    @Rollback
    public void testBlankNameArtistSave() {
        Artist artist = Artist.builder()
                .name("  ")
                .build();

        assertThrows(ConstraintViolationException.class,
                () -> artistRepository.saveAndFlush(artist));
    }

}