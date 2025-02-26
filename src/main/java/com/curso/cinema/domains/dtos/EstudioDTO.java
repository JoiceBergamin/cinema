package com.curso.cinema.domains.dtos;

import com.curso.cinema.domains.Estudio;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EstudioDTO {

    private Integer id;

    @NotNull(message = "O campo nomeEstudio não pode ser nulo")
    @NotBlank(message = "O campo nomeEstudio não pode estar vazio")
    private String nomeEstudio;

    @NotNull(message = "O campo cnpj não pode ser nulo")
    @NotBlank(message = "O campo cnpj não pode estar vazio")
    private String cnpj;

    public EstudioDTO(Estudio estudio) {
        this.id = estudio.getId();
        this.nomeEstudio = estudio.getNomeEstudio();
        this.cnpj = estudio.getCnpj();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nomeEstudio não pode ser nulo") @NotBlank(message = "O campo nomeEstudio não pode estar vazio") String getNomeEstudio() {
        return nomeEstudio;
    }

    public void setNomeEstudio(@NotNull(message = "O campo nomeEstudio não pode ser nulo") @NotBlank(message = "O campo nomeEstudio não pode estar vazio") String nomeEstudio) {
        this.nomeEstudio = nomeEstudio;
    }

    public @NotNull(message = "O campo cnpj não pode ser nulo") @NotBlank(message = "O campo cnpj não pode estar vazio") String getCnpj() {
        return cnpj;
    }

    public void setCnpj(@NotNull(message = "O campo cnpj não pode ser nulo") @NotBlank(message = "O campo cnpj não pode estar vazio") String cnpj) {
        this.cnpj = cnpj;
    }
}
