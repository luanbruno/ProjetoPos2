package br.com.infnet.proj.apiestoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.proj.apiestoque.model.domain.Referencia;
import br.com.infnet.proj.apiestoque.model.domain.repository.ReferenciaRepository;
@Service
public class ReferenciaService {

	@Autowired
	private ReferenciaRepository referenciaRepository;

	public void incluir(Referencia referencia) {
		referenciaRepository.save(referencia);

	}
	
	public List<Referencia> obterLista(){
		return (List<Referencia>) referenciaRepository.findAll();
	}
	
	public void excluir(Integer id) {
		referenciaRepository.deleteById(id);

	}
	public List<Referencia> obterLista(Integer idProduto) {
        return referenciaRepository.obterLista(idProduto);
    }
	
}
