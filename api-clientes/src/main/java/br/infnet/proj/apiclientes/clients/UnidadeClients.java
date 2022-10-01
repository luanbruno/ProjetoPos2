package br.infnet.proj.apiclientes.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.infnet.proj.apiclientes.model.domain.Unidade;

//@FeignClient(value = "estoque", path = "/api/")
@FeignClient(url = "localhost:8081/api/unidade", name = "unidadeClient")
public interface UnidadeClients { 
	
	@GetMapping(value = "/listar")
	public List<Unidade> obterListaUnidade();
	
}
