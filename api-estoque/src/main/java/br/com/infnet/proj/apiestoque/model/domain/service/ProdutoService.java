package br.com.infnet.proj.apiestoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.proj.apiestoque.model.domain.Produto;
import br.com.infnet.proj.apiestoque.model.domain.repository.ProdutoRepository;
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
		return produtoRepository.findById(id).orElse(null);
	}
}
