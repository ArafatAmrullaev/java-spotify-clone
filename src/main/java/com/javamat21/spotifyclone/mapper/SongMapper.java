package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.SongDTO;
import com.javamat21.spotifyclone.entities.Song;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface SongMapper {
    SongDTO songToSongDto(Song song);
    Song songDtoToSong(SongDTO dto);

}

