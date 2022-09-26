package br.com.infnet.proj.apiestoque.model.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.proj.apiestoque.model.domain.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Integer> {

}
