package com.vadres.bc.batch.chunks;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vadres.bc.models.Cidade;
import com.vadres.bc.services.CidadeEstadoService;

@Component
public class CidadeEstadoWriter implements ItemWriter<Cidade> {
    @Autowired
    private CidadeEstadoService service;
	
	@SuppressWarnings("unchecked")
	@Override
	public void write(List<? extends Cidade> cidades) throws Exception {
		service.saveAll((List<Cidade>) cidades);
	}

}
