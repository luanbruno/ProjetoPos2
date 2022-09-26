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

import br.edu.infnet.proj.estoque.model.domain.Referencia;
import br.edu.infnet.proj.estoque.model.domain.service.ReferenciaService;

@RestController
@RequestMapping(value = "/api/referencia")
public class ReferenciaController {

	@Autowired	
	private ReferenciaService referenciaService;
	
	
	@GetMapping(value = "/listar")
	public List<Referencia> obterLista() {

		return referenciaService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Referencia referencia) {

		referenciaService.incluir(referencia);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		referenciaService.excluir(id);
	}
	
	@GetMapping("/listar/{idProduto}")
    public List<Referencia> obterLista(@PathVariable Integer idProduto){
        return referenciaService.obterLista(idProduto);
    }
}
