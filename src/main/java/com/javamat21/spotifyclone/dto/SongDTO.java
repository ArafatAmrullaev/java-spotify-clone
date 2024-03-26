package com.javamat21.spotifyclone.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SongDTO {
    private Long id;

    @NotNull
    @NotBlank
    private String title;

    private ArtistDTO artist;

}