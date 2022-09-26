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

import br.com.infnet.proj.apiestoque.model.domain.Produto;
import br.com.infnet.proj.apiestoque.model.domain.service.ProdutoService;

@RestController
@RequestMapping(value = "/api/produto")
public class ProdutoController {

	@Autowired	
	private ProdutoService produtoService;
	
	@GetMapping(value = "/listar")
	public List<Produto> obterLista() {

		return produtoService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Produto produto) {

		produtoService.incluir(produto);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		produtoService.excluir(id);
	}
	@GetMapping(value="/obter/{idProduto}")
	public Produto obterPorId(@PathVariable int idProduto) {
		return produtoService.obterPorId(idProduto);
	}
}
