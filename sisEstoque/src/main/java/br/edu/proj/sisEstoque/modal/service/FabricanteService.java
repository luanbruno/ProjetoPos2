package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.proj.sisEstoque.clients.ConexaoClients;
import br.edu.proj.sisEstoque.modal.domain.Fabricante;

@Service
public class FabricanteService {

	
	@Autowired	
	private ConexaoClients fabricanteClients;

	public List<Fabricante> obterLista() {
		return fabricanteClients.obterLista();
	}

	public void incluir(Fabricante fabricante) {
		fabricanteClients.incluir(fabricante);
	}

	public void excluir(Integer id) {
		fabricanteClients.excluir(id);
	}
}
