package br.edu.proj.sisEstoque.modal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.proj.sisEstoque.clients.ConexaoClients;
import br.edu.proj.sisEstoque.modal.domain.Produto;

@Service
public class ProdutoService {
	@Autowired	
	private ConexaoClients produtoClients;

	
	public List<Produto> obterLista() {
		return produtoClients.obterListaProduto();
	}

	public void incluir(Produto produto) {
		produtoClients.incluir(produto);
	}

	public void excluir(Integer id) {
		produtoClients.excluirProduto(id);
	}
	public Produto obterPorId(Integer id){
		return produtoClients.obterPorIdProduto(id);
	}
}
