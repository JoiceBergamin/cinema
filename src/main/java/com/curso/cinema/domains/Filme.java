package com.curso.cinema.domains;

import com.curso.cinema.domains.enums.Nota;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_filme")
    private Long id;
    @NotNull @NotBlank
    private String nomeFilme;
    @NotNull @NotBlank
    private String autorRoteiro;

    @ManyToOne
    @JoinColumn(name = "id_estudio")
    private Estudio estudio;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "nota")
    private Nota nota;

    public Filme() {
    }


    public Filme(Long id, String nomeFilme, String autorRoteiro,Estudio estudio, Nota nota) {
        this.id = id;
        this.nomeFilme = nomeFilme;
        this.autorRoteiro = autorRoteiro;
        this.estudio = estudio;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getAutorRoteiro() {
        return autorRoteiro;
    }

    public void setAutorRoteiro(String autorRoteiro) {
        this.autorRoteiro = autorRoteiro;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return id.equals(filme.id) && nomeFilme.equals(filme.nomeFilme) && autorRoteiro.equals(filme.autorRoteiro) && estudio.equals(filme.estudio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeFilme, autorRoteiro, estudio);
    }
}
