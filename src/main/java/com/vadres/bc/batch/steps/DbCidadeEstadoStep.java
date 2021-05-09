package com.vadres.bc.batch.steps;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vadres.bc.batch.chunks.CidadeEstadoProcessor;
import com.vadres.bc.batch.chunks.CidadeEstadoReader;
import com.vadres.bc.batch.chunks.CidadeEstadoWriter;
import com.vadres.bc.models.Cidade;

@Configuration
public class DbCidadeEstadoStep {

	@Autowired
	private StepBuilderFactory steps;
	
	@Autowired
	private CidadeEstadoReader reader;
	
	@Autowired
	private CidadeEstadoWriter writer;
	
	@Autowired
	private CidadeEstadoProcessor processor;
	
	@Bean
    public Step processCidades() {
		return steps.get("processCidades")
				    .<Cidade,Cidade> chunk(1)
				    .reader(reader)
                    .processor(processor)
				    .writer(writer)
				    .build();
	}
}
