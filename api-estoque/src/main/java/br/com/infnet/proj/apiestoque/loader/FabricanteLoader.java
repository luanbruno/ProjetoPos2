package br.com.infnet.proj.apiestoque.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.proj.apiestoque.model.domain.Fabricante;
import br.com.infnet.proj.apiestoque.model.domain.service.FabricanteService;

@Component
@Order(5)
public class FabricanteLoader implements ApplicationRunner{

	@Autowired
	private FabricanteService fabricanteService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Fabricante fabricante = new Fabricante();
			fabricante.setNome("moura");
			fabricante.setSigla("MR");
			fabricanteService.incluir(fabricante);			
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	
	

}
