package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.proj.sisEstoque.clients.ConexaoClients;
import br.edu.proj.sisEstoque.modal.domain.Referencia;

@Service
public class ReferenciaService {

	@Autowired	
	private ConexaoClients referenciaClients;

	
	public List<Referencia> obterLista() {
		return referenciaClients.obterListaReferencia();
	}

	public void incluir(Referencia referencia) {
		referenciaClients.incluir(referencia);
	}

	public void excluir(Integer id) {
		referenciaClients.excluirReferencia(id);
	}
    public List<Referencia> obterLista(@PathVariable Integer idProduto){
    	return referenciaClients.obterListaReferencia(idProduto);
    	
    }

	
}
