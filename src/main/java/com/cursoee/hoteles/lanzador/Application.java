package com.cursoee.hoteles.lanzador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.cursoee.hoteles.dao")
@EntityScan(basePackages = "com.cursoee.hoteles.model")
@SpringBootApplication(scanBasePackages = {"com.cursoee.hoteles.controller",
											"com.cursoee.hoteles.service"})
//		"com.cursoee.hoteles.lanzador"})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
