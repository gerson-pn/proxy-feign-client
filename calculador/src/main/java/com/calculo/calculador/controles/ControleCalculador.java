package com.calculo.calculador.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculo.calculador.dto.Calculo;
import com.calculo.calculador.dto.Resposta;
import com.calculo.calculador.proxy.ProxySoma;

@RestController
public class ControleCalculador {

	@Autowired
	private ProxySoma proxySoma;

	@GetMapping("/calcular")
	public ResponseEntity<Resposta> calcular(@RequestBody Calculo calculo) {
		Double numero1 = calculo.getNumero1();
		Double numero2 = calculo.getNumero2();
		String operacao = calculo.getOperacao();

		if (operacao.equals("soma")) {
			Resposta resposta = proxySoma.resposta(numero1, numero2);
			return new ResponseEntity<Resposta>(resposta, HttpStatus.ACCEPTED);

		} else {
			return new ResponseEntity<Resposta>(HttpStatus.BAD_REQUEST);
		}

	}
}