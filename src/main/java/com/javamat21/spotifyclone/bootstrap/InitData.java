package com.javamat21.spotifyclone.bootstrap;

import com.javamat21.spotifyclone.entities.Artist;
import com.javamat21.spotifyclone.repositories.ArtistRepository;
import com.javamat21.spotifyclone.entities.Album;
import com.javamat21.spotifyclone.repositories.AlbumRepository;
import com.javamat21.spotifyclone.entities.Song;
import com.javamat21.spotifyclone.repositories.SongRepository;
import com.javamat21.spotifyclone.entities.Playlist;
import com.javamat21.spotifyclone.repositories.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class InitData implements CommandLineRunner {

    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;
    private final PlaylistRepository playlistRepository;

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


        Song song1 = Song.builder()
                .title("Song 1")
                .artist(artist1)
                .build();

        Song song2 = Song.builder()
                .title("Song 2")
                .artist(artist2)
                .build();

        songRepository.save(song1);
        songRepository.save(song2);


        Album album1 = Album.builder()
                .title("Album 1")
                .artist(artist1)
                .build();

        Album album2 = Album.builder()
                .title("Album 2")
                .artist(artist2)
                .build();

        album1.getSongs().add(song1);
        album2.getSongs().add(song2);

        albumRepository.save(album1);
        albumRepository.save(album2);


        Playlist playlist1 = Playlist.builder()
                .name("Playlist 1")
                .build();

        playlist1.getSongs().add(song1);
        playlist1.getSongs().add(song2);

        playlistRepository.save(playlist1);



    }
}

