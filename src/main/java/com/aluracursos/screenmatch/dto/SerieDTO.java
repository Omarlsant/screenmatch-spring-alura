package com.aluracursos.screenmatch.dto;

import com.aluracursos.screenmatch.model.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double evaluacion,
                       Categoria genero,
                       String actores,
                       String poster,
                       String sinopsis) {
    public SerieDTO(Long id, String titulo, Integer totalTemporadas, Double evaluacion, String poster, Categoria genero, String actores, String sinopsis) {
    }
}