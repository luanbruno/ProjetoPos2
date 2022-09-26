package br.infnet.proj.apiclientes.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.proj.apiclientes.model.domain.Cliente;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

	Cliente findClienteById(Long id);
    void deleteById(Long id);
	
}
