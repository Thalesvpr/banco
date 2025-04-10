package com.ibmec.bigdata.banco;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCosmosRepositories(basePackages = "com.ibmec.bigdata.banco.repository.cosmos")
public class BancoApplication {
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

}

