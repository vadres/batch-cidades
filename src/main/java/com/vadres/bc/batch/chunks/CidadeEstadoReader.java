package com.vadres.bc.batch.chunks;

import java.util.Optional;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vadres.bc.models.Cidade;
import com.vadres.bc.services.CidadeEstadoService;

@Component
public class CidadeEstadoReader implements ItemReader<Cidade> {
    @Autowired
    CidadeEstadoService service;
    
	@Override
	public Cidade read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	    Optional<Cidade> cidade = service.nextCidade();
		return cidade.isPresent()? cidade.get(): null;
	}

}
