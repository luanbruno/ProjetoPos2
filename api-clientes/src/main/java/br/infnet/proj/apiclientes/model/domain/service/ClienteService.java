package br.infnet.proj.apiclientes.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.proj.apiclientes.model.domain.Cliente;
import br.infnet.proj.apiclientes.model.domain.repository.ClienteRepository;
@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> obterLista() {		
		return (List<Cliente>) clienteRepository.findAll();
	}
		
	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}
	
}
