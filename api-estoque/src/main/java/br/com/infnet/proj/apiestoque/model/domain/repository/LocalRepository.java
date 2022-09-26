package br.com.infnet.proj.apiestoque.model.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.infnet.proj.apiestoque.model.domain.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Integer> {

	@Query("from Local f where f.produto.id = :idProduto")
    public List<Local> obterLista(Integer idProduto);

}
