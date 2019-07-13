package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {
		"com.crud.model",
		"com.crud.service",
		"com.crud.repository",
		"com.crud.controller"
})
public class CrTp3Application {

	public static void main(String[] args) {
		SpringApplication.run(CrTp3Application.class, args);
	}

}
