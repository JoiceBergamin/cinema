package com.curso.cinema.domains.dtos;

import com.curso.cinema.domains.Estudio;
import com.curso.cinema.domains.Filme;
import com.curso.cinema.domains.enums.Nota;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FilmeDTO {

    private Long id;

    @NotNull(message = "O campo nomeFilme não pode ser nulo")
    @NotBlank(message = "O campo nomeFilme não pode estar vazio")
    private String nomeFilme;

    @NotNull(message = "O campo autorRoteiro não pode ser nulo")
    @NotBlank(message = "O campo autorRoteiro não pode estar vazio")
    private String autorRoteiro;

    @NotNull(message = "O campo Estudio é requerido")
    private int estudio;
    private String nomeEstudio;

    private int nota;

    public FilmeDTO(Filme filme) {
        this.id = filme.getId();
        this.nomeFilme = filme.getNomeFilme();
        this.autorRoteiro = filme.getAutorRoteiro();
        this.estudio = filme.getEstudio().getId();
        this.nomeEstudio = filme.getEstudio().getNomeEstudio();
        this.nota = filme.getNota().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nomeFilme não pode ser nulo") @NotBlank(message = "O campo nomeFilme não pode estar vazio") String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(@NotNull(message = "O campo nomeFilme não pode ser nulo") @NotBlank(message = "O campo nomeFilme não pode estar vazio") String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public @NotNull(message = "O campo autorRoteiro não pode ser nulo") @NotBlank(message = "O campo autorRoteiro não pode estar vazio") String getAutorRoteiro() {
        return autorRoteiro;
    }

    public void setAutorRoteiro(@NotNull(message = "O campo autorRoteiro não pode ser nulo") @NotBlank(message = "O campo autorRoteiro não pode estar vazio") String autorRoteiro) {
        this.autorRoteiro = autorRoteiro;
    }

    @NotNull(message = "O campo Estudio é requerido")
    public int getEstudio() {
        return estudio;
    }

    public void setEstudio(@NotNull(message = "O campo Estudio é requerido") int estudio) {
        this.estudio = estudio;
    }

    public String getNomeEstudio() {
        return nomeEstudio;
    }

    public void setNomeEstudio(String nomeEstudio) {
        this.nomeEstudio = nomeEstudio;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
