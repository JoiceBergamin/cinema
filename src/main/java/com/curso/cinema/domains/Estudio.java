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
    private String CNPJ;

    public Estudio() {
    }

    public Estudio(Integer id, String nomeEstudio, String CNPJ) {
        this.id = id;
        this.nomeEstudio = nomeEstudio;
        this.CNPJ = CNPJ;
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

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudio estudio = (Estudio) o;
        return Objects.equals(id, estudio.id) && Objects.equals(nomeEstudio, estudio.nomeEstudio) && Objects.equals(CNPJ, estudio.CNPJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeEstudio, CNPJ);
    }
}
