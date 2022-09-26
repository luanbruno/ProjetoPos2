package br.com.infnet.proj.apiestoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.proj.apiestoque.model.domain.Fabricante;
import br.com.infnet.proj.apiestoque.model.domain.repository.FabricanteRepository;
@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository fabricanteRepository;

	public void incluir(Fabricante fabricante) {
		fabricanteRepository.save(fabricante);

	}
	public List<Fabricante> obterLista(){
		return (List<Fabricante>) fabricanteRepository.findAll();
	}
	
	public void excluir(Integer id) {
		fabricanteRepository.deleteById(id);

	}
}
