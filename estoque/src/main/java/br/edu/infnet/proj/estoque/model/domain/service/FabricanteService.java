package br.edu.infnet.proj.estoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.proj.estoque.exceptions.FabricanteNotfaundException;
import br.edu.infnet.proj.estoque.model.domain.Fabricante;
import br.edu.infnet.proj.estoque.model.domain.repository.FabricanteRepository;
@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository fabricanteRepository;

	public void incluir(Fabricante fabricante) {
		fabricanteRepository.save(fabricante);

	}
	public List<Fabricante> obterLista(){
		List<Fabricante> fabricante = (List<Fabricante>) fabricanteRepository.findAll();
		if(fabricante.isEmpty()) throw new FabricanteNotfaundException("");
		return (List<Fabricante>) fabricanteRepository.findAll();
		
	}
	
	public void excluir(Integer id) {
		fabricanteRepository.deleteById(id);

	}
}
