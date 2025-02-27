package com.curso.cinema.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "estudio")
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estudio")
    private Integer id;

    @NotNull @NotBlank
    private String nomeEstudio;

    @NotNull @NotBlank
    private String cnpj;

    @JsonIgnore
    @OneToMany(mappedBy = "estudio")
    private List<Filme> filmes = new ArrayList<>();

    public Estudio() {
    }

    public Estudio(Integer id, String nomeEstudio, String cnpj) {
        this.id = id;
        this.nomeEstudio = nomeEstudio;
        this.cnpj = cnpj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull @NotBlank String getNomeEstudio() {
        return nomeEstudio;
    }

    public void setNomeEstudio(@NotNull @NotBlank String nomeEstudio) {
        this.nomeEstudio = nomeEstudio;
    }

    public @NotNull @NotBlank String getCnpj() {
        return cnpj;
    }

    public void setCnpj(@NotNull @NotBlank String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}

