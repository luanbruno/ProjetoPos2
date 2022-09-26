package br.edu.infnet.proj.estoque.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.proj.estoque.model.domain.Fabricante;

@Repository
public interface FabricanteRepository extends CrudRepository<Fabricante, Integer>{

}
