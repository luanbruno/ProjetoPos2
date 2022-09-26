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

import br.com.infnet.proj.apiestoque.model.domain.Local;
import br.com.infnet.proj.apiestoque.model.domain.service.LocalService;

@RestController
@RequestMapping(value = "/api/local")
public class LocalController {

	@Autowired	
	private LocalService localService;
	
	
	
	@GetMapping(value = "/listar")
	public List<Local> obterLista() {

		return localService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Local local) {

		localService.incluir(local);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {

		localService.excluir(id);
	}
	
	@GetMapping("/listar/{idProduto}")
    public List<Local> obterLista(@PathVariable Integer idProduto){
        return localService.obterLista(idProduto);
    }
}
