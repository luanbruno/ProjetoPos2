package br.edu.infnet.proj.estoque.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.proj.estoque.model.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
