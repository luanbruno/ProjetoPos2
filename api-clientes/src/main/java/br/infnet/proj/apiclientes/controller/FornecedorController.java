package br.infnet.proj.apiclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.proj.apiclientes.model.domain.Fornecedor;
import br.infnet.proj.apiclientes.model.domain.service.FornecedorService;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {

	@Autowired
	private FornecedorService fornecedorService;

	@GetMapping(value = "/listar")
	public List<Fornecedor> obterLista() {
		return fornecedorService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Fornecedor fornecedor) {
		fornecedorService.incluir(fornecedor);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		fornecedorService.excluir(id);
	}
		
}
