package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.proj.sisEstoque.clients.ConeClients;
import br.edu.proj.sisEstoque.modal.domain.Fornecedor;
@Service
public class FornecedorService {

	@Autowired	
	private ConeClients FornecedorClients;

	
	public List<Fornecedor> obterLista() {
		return FornecedorClients.obterListaFornecedor();
	}

	public void incluir(Fornecedor fornecedor) {
		FornecedorClients.incluir(fornecedor);
	}

	public void excluir(Integer id) {
		FornecedorClients.excluirFornecedor(id);
	}
}
