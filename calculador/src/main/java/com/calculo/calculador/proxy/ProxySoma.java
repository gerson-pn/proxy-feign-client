package com.calculo.calculador.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.calculo.calculador.dto.Resposta;

@FeignClient(name = "soma-servico", url = "localhost:8080")
public interface ProxySoma {
	@GetMapping("/somar/numero/{numero1}/mais/{numero2}")
	public Resposta resposta(@PathVariable double numero1, @PathVariable double numero2);
}

