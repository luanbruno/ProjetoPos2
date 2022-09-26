package br.com.infnet.proj.apiestoque.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.proj.apiestoque.model.domain.Grupo;
import br.com.infnet.proj.apiestoque.model.domain.service.GrupoService;

@Component
@Order(4)
public class GrupoLoader implements ApplicationRunner{

	@Autowired
	private GrupoService grupoService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Grupo grupo = new Grupo();
			grupo.setNome("eletrica");
			grupoService.incluir(grupo);			
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	
	

}
