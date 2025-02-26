package com.curso.cinema.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
}

