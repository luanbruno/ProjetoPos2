package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	private static final Logger LOGGER = Logger.getLogger(AppController.class.getName());

	@GetMapping(value = "/")
	public String index() {
		LOGGER.info("tela inicial");
		return "index";
		
	}
	
}
