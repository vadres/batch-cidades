package com.vadres.bc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vadres.bc.models.Cidade;
import com.vadres.bc.repositories.CidadeRepo;

@Service
public class CidadeEstadoService {
	@Autowired
    private CidadeRepo cidadeRepo;
	
	private Integer row;
	
	public CidadeEstadoService() {
		row = 1;
	}
	
	public Optional<Cidade> nextCidade() {
		return cidadeRepo.findById(row++);
	}
	
	public void saveAll(List<Cidade> cidades) {
		cidadeRepo.saveAll(cidades);
	}
	
}
