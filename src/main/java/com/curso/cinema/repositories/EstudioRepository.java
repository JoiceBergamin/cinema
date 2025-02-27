package com.curso.cinema.repositories;

import com.curso.cinema.domains.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Integer> {

Optional<Estudio> findByCnpj(String cnpj);
}
