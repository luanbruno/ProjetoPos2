package br.edu.infnet.proj.estoque.model.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.proj.estoque.model.domain.Referencia;

@Repository
public interface ReferenciaRepository extends CrudRepository<Referencia, Integer> {
	
	@Query("from Referencia f where f.produto.id = :idProduto")
    public List<Referencia> obterLista(Integer idProduto);


}
