package com.vadres.bc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vadres.bc.models.Cidade;

@Repository
public interface CidadeRepo extends JpaRepository<Cidade, Integer> {

}
