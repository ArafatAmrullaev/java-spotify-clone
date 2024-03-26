package com.javamat21.spotifyclone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.javamat21.spotifyclone.dto.AlbumDTO;
import com.javamat21.spotifyclone.entities.Album;

@Mapper
public interface AlbumMapper {
    AlbumDTO albumToAlbumDto(Album album);
    Album albumDtoToAlbum(AlbumDTO dto);

}

