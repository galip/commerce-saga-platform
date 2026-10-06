package com.commerce.platform.orchestrator;

import org.springframework.boot.SpringApplication;

public class TestSagaOrchestratorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(SagaOrchestratorServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
