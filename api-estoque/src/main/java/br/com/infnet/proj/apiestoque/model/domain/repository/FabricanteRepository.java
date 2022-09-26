package br.com.infnet.proj.apiestoque.model.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.proj.apiestoque.model.domain.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Integer>{

}
