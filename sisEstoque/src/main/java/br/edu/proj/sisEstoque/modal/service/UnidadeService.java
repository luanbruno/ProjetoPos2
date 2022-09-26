package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.proj.sisEstoque.clients.ConexaoClients;
import br.edu.proj.sisEstoque.modal.domain.Unidade;

@Service
public class UnidadeService {
	@Autowired	
	private ConexaoClients unidadeClients;
	//@Autowired	
	//private UnidadeClients unidadeClients;
	
	public List<Unidade> obterLista() {
		return unidadeClients.obterListaUnidade();
	}

	public void incluir(Unidade unidade) {
		unidadeClients.incluir(unidade);
	}

	public void excluir(Integer id) {
		unidadeClients.excluirUnidade(id);
	}
}
