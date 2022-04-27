package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return"Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return"<b>Lista de BSM<br />"
				+ "BSM-GM - Mentalidade de Crescimento <br />"
				+ "BSM-P- Persistência<br />"
				+ "BSM-PR - Responsabilidade Pessoal<br />"
				+ "BSM-FO - Orientação ao Futuro<br />"
				+ "BSM-C - Comunicação<br />"
				+ "BSM-OD - Orientação ao Detalhe<br />"
				+ "BSM-PA - Proatividade<br />"
				+ "BSM-T- Trabalho em Equipe";
	}
	@GetMapping("/objetivo")
	public String objetivo() {
		return"Meus objetivos são: <br />"
				+ "1 - Estudar mais sobre as linguagem nova MySQL; <br />"
				+ "2 - Me aperfeiçoar na utilização do STS; <br />"
				+ "3 - Revisar todo o conteúdo lecionado na semana; <br />"
				+ "4 - Aprender mais sobre o GitHub. <br />";
	}
	
	
	
	
	
}
