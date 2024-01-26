package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJpaAuditing
@SpringBootApplication
public class SpringHomepage1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringHomepage1Application.class, args);
	}

}
