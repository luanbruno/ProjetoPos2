package br.infnet.proj.apiclientes.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.proj.apiclientes.model.domain.Fornecedor;
@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer>{

}
