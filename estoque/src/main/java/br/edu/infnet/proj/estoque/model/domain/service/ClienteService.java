package br.edu.infnet.proj.estoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.proj.estoque.clients.ClienteClients;
import br.edu.infnet.proj.estoque.model.domain.dto.ClienteDTO;
@Service
public class ClienteService {
	
	@Autowired	
	private ClienteClients clienteClients;
	
	public List<ClienteDTO> obterLista() {
		return clienteClients.obterListaCliente();
	}
}
