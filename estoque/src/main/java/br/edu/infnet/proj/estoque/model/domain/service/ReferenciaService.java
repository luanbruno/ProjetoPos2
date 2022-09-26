package br.edu.infnet.proj.estoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.proj.estoque.exceptions.FabricanteNotfaundException;
import br.edu.infnet.proj.estoque.model.domain.Referencia;
import br.edu.infnet.proj.estoque.model.domain.repository.ReferenciaRepository;
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
		//List<Referencia> referencia =  referenciaRepository.obterLista(idProduto);
        //if(referencia.isEmpty()) throw new FabricanteNotfaundException("nada para listar");
        return referenciaRepository.obterLista(idProduto);
    }
	
}
