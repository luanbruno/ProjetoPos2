package br.infnet.proj.apiclientes.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.proj.apiclientes.clients.UnidadeClients;
import br.infnet.proj.apiclientes.model.domain.Unidade;
@Service
public class UnidadeService {

	@Autowired	
	private UnidadeClients unidadeClients;
	
	public List<Unidade> obterLista() {
		return unidadeClients.obterListaUnidade();
	}
}
