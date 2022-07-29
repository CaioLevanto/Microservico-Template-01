package br.com.mucatour.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.mucatour.core.model"})
@EnableJpaRepositories({"br.com.mucatour.core.repository"})
public class MtApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtApiApplication.class, args);
	}

}
