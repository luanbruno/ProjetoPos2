package br.edu.proj.sisEstoque.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.proj.sisEstoque.modal.domain.Cliente;

@FeignClient(url = "localhost:8081/api/cliente", name = "clienteClient")
public interface ClienteClients {

	//cliente
	
		//@GetMapping(value = "/listar")
		//public List<Cliente> obterListaCliente();
	
	

}
