package br.edu.infnet.proj.estoque.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.proj.estoque.model.domain.Grupo;

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {

}
