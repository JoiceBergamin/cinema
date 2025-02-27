package com.curso.cinema.resources;

import com.curso.cinema.domains.Filme;
import com.curso.cinema.domains.dtos.FilmeDTO;
import com.curso.cinema.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/filme")
public class FilmeResource {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<FilmeDTO>> findAll(){
        return ResponseEntity.ok().body(filmeService.findAll());

    }
@GetMapping(value = "/{id}")
    public ResponseEntity<FilmeDTO> findById(@PathVariable Long id){
    Filme obj = this.filmeService.findbyId(id);
    return ResponseEntity.ok().body(new FilmeDTO(obj));
}
}
