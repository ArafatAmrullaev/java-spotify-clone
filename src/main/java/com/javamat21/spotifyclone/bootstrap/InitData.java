package com.javamat21.spotifyclone.bootstrap;

import com.javamat21.spotifyclone.entities.Artist;
import com.javamat21.spotifyclone.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class InitData implements CommandLineRunner {

    private final ArtistRepository artistRepository;

    @Override
    public void run(String... args) {
        log.warn("Initializing data");



        Artist artist1 = Artist.builder()
                .name("Artist 1")
                .build();

        Artist artist2 = Artist.builder()
                .name("Artist 2")
                .build();

        artistRepository.save(artist1);
        artistRepository.save(artist2);


    }
}

