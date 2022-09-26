package br.edu.infnet.proj.estoque.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.proj.estoque.model.domain.dto.ClienteDTO;

@FeignClient(value = "departamento", path = "/api/")
public interface ClienteClients {

	@GetMapping(value = "cliente/listar")
	public List<ClienteDTO> obterListaCliente();
}
