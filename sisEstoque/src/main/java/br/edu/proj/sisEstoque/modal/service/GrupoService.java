package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.proj.sisEstoque.clients.ConexaoClients;
import br.edu.proj.sisEstoque.modal.domain.Grupo;

@Service
public class GrupoService {

	@Autowired	
	private ConexaoClients grupoClients;

	
	public List<Grupo> obterLista() {
		return grupoClients.obterListaGrupo();
	}

	public void incluir(Grupo grupo) {
		grupoClients.incluir(grupo);
	}

	public void excluir(Integer id) {
		grupoClients.excluirGrupo(id);
	}
}
