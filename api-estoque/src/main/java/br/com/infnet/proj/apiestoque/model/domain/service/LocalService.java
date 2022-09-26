package br.com.infnet.proj.apiestoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.proj.apiestoque.model.domain.Local;
import br.com.infnet.proj.apiestoque.model.domain.repository.LocalRepository;


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
        return localRepository.obterLista(idProduto);
    }
}
