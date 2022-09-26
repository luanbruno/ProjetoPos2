package br.edu.proj.sisEstoque.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.proj.sisEstoque.modal.domain.Cliente;
import br.edu.proj.sisEstoque.modal.domain.Fornecedor;

@FeignClient(value = "departamento", path = "/api/")
public interface ConeClients {

	//cliente
	
		@GetMapping(value = "cliente/listar")
		public List<Cliente> obterListaCliente();

		@PostMapping(value = "cliente/incluir")
		public void incluir(@RequestBody Cliente cliente);

		@DeleteMapping(value = "cliente/{id}/excluir")
		public void excluirCliente(@PathVariable Integer id);
		
		//fornecedor
		
		@GetMapping(value = "fornecedor/listar")
		public List<Fornecedor> obterListaFornecedor();
	
		@PostMapping(value = "fornecedor/incluir")
		public void incluir(@RequestBody Fornecedor fornecedor);
	
		@DeleteMapping(value = "fornecedor/{id}/excluir")
		public void excluirFornecedor(@PathVariable Integer id);
			
}
