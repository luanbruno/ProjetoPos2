package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.proj.sisEstoque.clients.ConexaoClients;
import br.edu.proj.sisEstoque.modal.domain.Local;

@Service
public class LocalService {

	@Autowired	
	private ConexaoClients localClients;

	
	public List<Local> obterLista() {
		return localClients.obterListaLocal();
	}

	public void incluir(Local local) {
		localClients.incluir(local);
	}

	public void excluir(Integer id) {
		localClients.excluir(id);
	}
    public List<Local> obterLista(@PathVariable Integer idProduto){
        return localClients.obterListaLocal(idProduto);
    }
}
