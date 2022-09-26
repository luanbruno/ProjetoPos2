package br.com.infnet.proj.apiestoque.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.proj.apiestoque.model.domain.Unidade;
import br.com.infnet.proj.apiestoque.model.domain.service.UnidadeService;

@Component
@Order(6)
public class UnidadeLoader implements ApplicationRunner{

	@Autowired
	private UnidadeService unidadeService;


	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Unidade unidade = new Unidade();
			unidade.setNome("centrimetro");
			unidade.setMedida("CM");
			unidadeService.incluir(unidade);
			
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}

	
	

}
