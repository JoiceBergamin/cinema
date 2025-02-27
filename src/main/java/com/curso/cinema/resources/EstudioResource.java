package com.curso.cinema.resources;

import com.curso.cinema.domains.Estudio;
import com.curso.cinema.domains.dtos.EstudioDTO;
import com.curso.cinema.services.EstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/estudio")
public class EstudioResource {

    @Autowired
    private EstudioService estudioService;

    @GetMapping
    public ResponseEntity<List<EstudioDTO>> findAll(){
        return ResponseEntity.ok().body(estudioService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EstudioDTO> findById(@PathVariable Integer id){
        Estudio obj = this.estudioService.findbyId(id);
        return ResponseEntity.ok().body(new EstudioDTO(obj));

    }
    @GetMapping("/cnpj/{cnpj}")
    public ResponseEntity<EstudioDTO> findById(@PathVariable String cnpj){
        Estudio obj = this.estudioService.findbyCnpj(cnpj);
        return ResponseEntity.ok().body(new EstudioDTO(obj));

    }
}
