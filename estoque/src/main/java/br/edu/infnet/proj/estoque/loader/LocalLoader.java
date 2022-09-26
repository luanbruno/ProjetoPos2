package br.edu.infnet.proj.estoque.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.proj.estoque.model.domain.Local;
import br.edu.infnet.proj.estoque.model.domain.Produto;
import br.edu.infnet.proj.estoque.model.domain.service.LocalService;

@Component
@Order(3)
public class LocalLoader implements ApplicationRunner{

	@Autowired
	private LocalService localService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Produto produto = new Produto();
			produto.setId(1);			
			
			Local local = new Local();
			local.setAndar("terrio");
			local.setPosicao("A12C15");
			local.setProduto(produto);
			localService.incluir(local);
			
			Local local2 = new Local();
			local2.setAndar("terrio");
			local2.setPosicao("A12C14");
			local2.setProduto(produto);
			localService.incluir(local2);	
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	
	

}
