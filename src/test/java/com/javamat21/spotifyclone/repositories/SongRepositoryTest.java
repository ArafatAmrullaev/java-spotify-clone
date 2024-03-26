package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Artist;
import com.javamat21.spotifyclone.entities.Song;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.TransactionSystemException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SongRepositoryTest {
    @Autowired
    private SongRepository songRepository;

    @Test
    public void testNullNameArtistSave() {
        Song song = Song.builder().build();

        assertThrows(TransactionSystemException.class,
                () -> songRepository.save(song));
    }


    @Test
    @Transactional
    @Rollback
    public void testBlankNameArtistSave() {
        Song song = Song.builder()
                .title("  ")
                .build();

        assertThrows(ConstraintViolationException.class,
                () -> songRepository.saveAndFlush(song));
    }


//    @Test
//    @Transactional
//    @Rollback
//    public void testNullTitleSongSave() {
//        Song song = Song.builder()
//                .artist(new Artist())
//                .build();
//
//        assertThrows(javax.validation.ConstraintViolationException.class,
//                () -> songRepository.saveAndFlush(song));
//    }
//
}

