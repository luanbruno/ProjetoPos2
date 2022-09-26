package br.com.infnet.proj.apiestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.proj.apiestoque.model.domain.Fabricante;
import br.com.infnet.proj.apiestoque.model.domain.service.FabricanteService;

@RestController
@RequestMapping(value = "/api/fabricante")
public class FabricanteController {

	@Autowired	
	private FabricanteService fabricanteService;
	
	@GetMapping(value = "/listar")
	public List<Fabricante> obterLista() {

		return fabricanteService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Fabricante fabricante) {

		fabricanteService.incluir(fabricante);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		fabricanteService.excluir(id);
	}
}
