package br.edu.infnet.proj.estoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.proj.estoque.model.domain.Unidade;
import br.edu.infnet.proj.estoque.model.domain.repository.UnidadeRepository;
@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository unidadeRepository;

	public void incluir(Unidade unidade) {
		unidadeRepository.save(unidade);

	}
	public List<Unidade> obterLista(){
		return (List<Unidade>) unidadeRepository.findAll();
	}
	
	public void excluir(Integer id) {
		unidadeRepository.deleteById(id);

	}
}
