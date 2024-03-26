package com.javamat21.spotifyclone.mapper;

import com.javamat21.spotifyclone.dto.PlaylistDTO;
import com.javamat21.spotifyclone.entities.Playlist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PlaylistMapper {
    PlaylistDTO playlistToPlaylistDto(Playlist playlist);
    Playlist playlistDtoToPlaylist(PlaylistDTO dto);

}


