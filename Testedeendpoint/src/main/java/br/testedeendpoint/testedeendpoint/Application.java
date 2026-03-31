package br.testedeendpoint.testedeendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages={"br.testedeendpoint.testedeendpoint"})
public class E3Application {

	public static void main(String[] args) {
		SpringApplication.run(E3Application.class, args);
	}

}
