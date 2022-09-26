package br.edu.infnet.proj.estoque.model.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.proj.estoque.model.domain.Local;

@Repository
public interface LocalRepository extends CrudRepository<Local, Integer> {

	@Query("from Local f where f.produto.id = :idProduto")
    public List<Local> obterLista(Integer idProduto);

}
