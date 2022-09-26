package br.com.infnet.proj.apiestoque.model.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.infnet.proj.apiestoque.model.domain.Referencia;

@Repository
public interface ReferenciaRepository extends JpaRepository<Referencia, Integer> {
	
	@Query("from Referencia f where f.produto.id = :idProduto")
    public List<Referencia> obterLista(Integer idProduto);


}
