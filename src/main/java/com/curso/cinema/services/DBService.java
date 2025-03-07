package com.curso.cinema.services;

import com.curso.cinema.domains.Estudio;
import com.curso.cinema.domains.Filme;
import com.curso.cinema.domains.enums.Nota;
import com.curso.cinema.repositories.EstudioRepository;
import com.curso.cinema.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private EstudioRepository estudioRepository;

    public void initDB() {

        Estudio estudio01 = new Estudio(null, "Fox Filmes","0001");
        Estudio estudio02 = new Estudio(null, "Walt Disney Studios","0002");
        Estudio estudio03 = new Estudio(null, "Universal","0003");
        Estudio estudio04 = new Estudio(null, "Ilumination","0004");

        Filme filme01 = new Filme(null, "A Era do Gelo", "Chris Wedge", estudio01,Nota.BOA);
        Filme filme02 = new Filme(null, "MOANA 2", "Jared Bush",estudio02, Nota.BOA);
        Filme filme03 = new Filme(null, "Velozes e Furiosos", "Ken Li",estudio03, Nota.BOA);
        Filme filme04 = new Filme(null, "Minions", "Brian Lynch",estudio04, Nota.BOA);

        estudioRepository.save(estudio01);
        estudioRepository.save(estudio02);
        estudioRepository.save(estudio03);
        estudioRepository.save(estudio04);

        filmeRepository.save(filme01);
        filmeRepository.save(filme02);
        filmeRepository.save(filme03);
        filmeRepository.save(filme04);
    }
}