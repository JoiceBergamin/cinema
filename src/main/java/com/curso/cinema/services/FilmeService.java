package com.curso.cinema.services;

import com.curso.cinema.domains.Filme;
import com.curso.cinema.domains.dtos.EstudioDTO;
import com.curso.cinema.domains.dtos.FilmeDTO;
import com.curso.cinema.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<FilmeDTO> findAll(){

        return filmeRepository.findAll().stream().map(obj -> new FilmeDTO(obj)).collect(Collectors.toList());
    }

    public Filme findbyId(Long id){
        Optional<Filme> obj = filmeRepository.findById(id);
        return obj.orElse(null);

    }
  }

