package com.calculo.calculador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CalculadorApplication {
	public static void main(String[] args) {
		SpringApplication.run(CalculadorApplication.class, args);
	}
}