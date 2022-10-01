package br.infnet.proj.apiclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.proj.apiclientes.model.domain.Unidade;
import br.infnet.proj.apiclientes.model.domain.service.UnidadeService;

@RestController
@RequestMapping("/api/unidade")
public class UnidadeControler {

	@Autowired
	private UnidadeService unidadeService;

	@GetMapping(value = "/listar")
	public List<Unidade> obterLista() {
		return unidadeService.obterLista();
	}
	
}
