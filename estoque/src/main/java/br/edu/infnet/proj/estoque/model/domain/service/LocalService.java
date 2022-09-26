package br.edu.infnet.proj.estoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.proj.estoque.exceptions.FabricanteNotfaundException;
import br.edu.infnet.proj.estoque.model.domain.Local;
import br.edu.infnet.proj.estoque.model.domain.repository.LocalRepository;


@Service
public class LocalService {

	@Autowired
	private LocalRepository localRepository;

	public void incluir(Local local) {
		localRepository.save(local);

	}
	

	
	public List<Local> obterLista(){
		return (List<Local>) localRepository.findAll();
	}
	
	public void excluir(Integer id) {
		localRepository.deleteById(id);

	}
	
	public List<Local> obterLista(Integer idProduto) {
		//List<Local> local =  localRepository.obterLista(idProduto);
       // if(local.isEmpty()) throw new FabricanteNotfaundException("nada para listar");
        return localRepository.obterLista(idProduto);
    }
}
