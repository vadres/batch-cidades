package com.vadres.bc.batch.chunks;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.vadres.bc.models.Cidade;

@Component
public class CidadeEstadoProcessor implements ItemProcessor<Cidade, Cidade> {

	@Override
	public Cidade process(Cidade cidade) throws Exception {
		cidade.setCidadeEstado( cidade.getNome() + " - " + cidade.getEstado().getNome() );		
		return cidade;
	}
  
}
