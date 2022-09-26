package br.infnet.proj.apiclientes.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.proj.apiclientes.model.domain.Fornecedor;
import br.infnet.proj.apiclientes.model.domain.repository.FornecedorRepository;
@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;

	public List<Fornecedor> obterLista() {		
		return (List<Fornecedor>) fornecedorRepository.findAll();
	}
		
	public void incluir(Fornecedor fornecedor) {
		fornecedorRepository.save(fornecedor);
	}
	
	public void excluir(Integer id) {
		fornecedorRepository.deleteById(id);
	}
		
}
