package br.edu.infnet.proj.estoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.proj.estoque.exceptions.FabricanteNotfaundException;
import br.edu.infnet.proj.estoque.model.domain.Produto;
import br.edu.infnet.proj.estoque.model.domain.repository.ProdutoRepository;
@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void incluir(Produto produto) {
		produtoRepository.save(produto);

	}
	public List<Produto> obterLista(){
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		produtoRepository.deleteById(id);

	}
	public Produto obterPorId(Integer id) {
		return produtoRepository.findById(id).orElseThrow(() -> new FabricanteNotfaundException("Nada para retornar"));
	}
}
