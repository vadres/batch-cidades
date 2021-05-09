package com.vadres.bc.batch.jobs;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vadres.bc.batch.steps.DbCidadeEstadoStep;

@Configuration
@EnableBatchProcessing
public class CreateDataCidadeEstadoJob {

	@Autowired
	private JobBuilderFactory jobs;
	
	@Autowired
	private DbCidadeEstadoStep dbStep;
	
	@Bean
	public Job job() {
		return this.jobs
				   .get("jobs")
				   .start(dbStep.processCidades())
				   .incrementer(new RunIdIncrementer())
				   .build();
				  
	}
	
}
