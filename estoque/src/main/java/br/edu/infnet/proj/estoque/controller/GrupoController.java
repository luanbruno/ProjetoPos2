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

import br.edu.infnet.proj.estoque.model.domain.Grupo;
import br.edu.infnet.proj.estoque.model.domain.service.GrupoService;

@RestController
@RequestMapping(value = "/api/grupo")
public class GrupoController {

	@Autowired	
	private GrupoService grupoService;
	
	@GetMapping(value = "/listar")
	public List<Grupo> obterLista() {

		return grupoService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Grupo grupo) {

		grupoService.incluir(grupo);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		grupoService.excluir(id);
	}
}
