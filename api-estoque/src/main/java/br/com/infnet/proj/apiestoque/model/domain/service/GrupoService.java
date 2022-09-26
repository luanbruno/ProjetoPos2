package br.com.infnet.proj.apiestoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.proj.apiestoque.model.domain.Grupo;
import br.com.infnet.proj.apiestoque.model.domain.repository.GrupoRepository;
@Service
public class GrupoService {

	@Autowired
	private GrupoRepository grupoRepository;

	public void incluir(Grupo grupo) {
		grupoRepository.save(grupo);

	}
	public List<Grupo> obterLista(){
		return (List<Grupo>) grupoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		grupoRepository.deleteById(id);

	}
	
}
