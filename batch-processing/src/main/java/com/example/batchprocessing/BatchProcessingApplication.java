package com.example.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://spring.io/guides/gs/batch-processing/
@SpringBootApplication
public class BatchProcessingApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BatchProcessingApplication.class, args);
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}

}
