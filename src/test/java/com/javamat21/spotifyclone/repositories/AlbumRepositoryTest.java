package com.javamat21.spotifyclone.repositories;

import com.javamat21.spotifyclone.entities.Album;
import com.javamat21.spotifyclone.entities.Artist;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import jakarta.transaction.Transactional;
import org.springframework.transaction.TransactionSystemException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class AlbumRepositoryTest {
    @Autowired
    private AlbumRepository albumRepository;

    @Test
    public void testNullNameArtistSave() {
        Album album = Album.builder().build();

        assertThrows(TransactionSystemException.class,
                () -> albumRepository.save(album));
    }


    @Test
    @Transactional
    @Rollback
    public void testBlankNameArtistSave() {
        Album album = Album.builder()
                .title("  ")
                .build();

        assertThrows(ConstraintViolationException.class,
                () -> albumRepository.saveAndFlush(album));
    }


//    @Test
//    @Transactional
//    @Rollback
//    public void testNullTitleAlbumSave() {
//        Album album = Album.builder()
//                .artist(new Artist()) // Provide a valid artist or mock it
//                .build();
//
//        assertThrows(javax.validation.ConstraintViolationException.class,
//                () -> albumRepository.saveAndFlush(album));
//    }

}
