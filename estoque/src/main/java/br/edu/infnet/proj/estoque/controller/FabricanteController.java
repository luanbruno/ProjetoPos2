package br.edu.infnet.proj.estoque.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.proj.estoque.model.domain.Fabricante;
import br.edu.infnet.proj.estoque.model.domain.service.FabricanteService;

@RestController
@RequestMapping(value = "/api/fabricante")
public class FabricanteController {
	private static final Logger LOGGER = Logger.getLogger(FabricanteController.class.getName());

	@Autowired	
	private FabricanteService fabricanteService;
	
	@GetMapping(value = "/listar")
	public List<Fabricante> obterLista() {
		LOGGER.info("fabricante listar");
		return fabricanteService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Fabricante fabricante) {
		LOGGER.info("fabricante incluido");
		fabricanteService.incluir(fabricante);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		LOGGER.info("fabricante excluido");
		fabricanteService.excluir(id);
	}
}
