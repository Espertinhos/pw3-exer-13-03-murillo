package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("exercicios")
@RestController
public class ExercicioController {

	@GetMapping
	public String aloMundo() {
		return "aloMundo";
	}
	
	@GetMapping("/dobro")
	public double dobro(@RequestParam("num") int num){
		return num *2;
	}
	
	@GetMapping("/{num}/{num2}")
	public double pontencia(@PathVariable int num,
							@PathVariable int num2){
		return Math.pow(num, num2);
	}
	
	@GetMapping("/sqr")
	public double raiz(@RequestParam("num") int num) {
		return Math.sqrt(num);
	}
		
}
