package br.edu.infnet.proj.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.proj.estoque.model.domain.Unidade;
import br.edu.infnet.proj.estoque.model.domain.service.UnidadeService;

@RestController
@RequestMapping(value = "/api/unidade")
public class UnidadeController {
	
	@Autowired	
	private UnidadeService unidadeService;
	
	@GetMapping(value = "/listar")
	public List<Unidade> obterLista() {

		return unidadeService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Unidade unidade) {

		unidadeService.incluir(unidade);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		unidadeService.excluir(id);
	}
}
