package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.proj.sisEstoque.clients.ClienteClients;
import br.edu.proj.sisEstoque.clients.ConeClients;
import br.edu.proj.sisEstoque.modal.domain.Cliente;
@Service
public class ClienteService {

	@Autowired	
	private ConeClients clienteClients;
	
	@Autowired	
	private ClienteClients clientexClients;
	
	public List<Cliente> obterLista() {
		return clienteClients.obterListaCliente();
	}

	public void incluir(Cliente cliente) {
		clienteClients.incluir(cliente);
	}

	public void excluir(Integer id) {
		clienteClients.excluirCliente(id);
	}
}
