package com.curso.cinema.services;

import com.curso.cinema.domains.Estudio;
import com.curso.cinema.domains.dtos.EstudioDTO;
import com.curso.cinema.repositories.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EstudioService {

    @Autowired
    private EstudioRepository estudioRepository;

    public List<EstudioDTO> findAll(){
        return estudioRepository.findAll().stream().map(obj -> new EstudioDTO(obj)).collect(Collectors.toList());
    }

    public Estudio findbyId(int id){
        Optional<Estudio> obj = estudioRepository.findById(id);
        return obj.orElse(null);
    }
}
