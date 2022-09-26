package br.com.infnet.proj.apiestoque.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.proj.apiestoque.model.domain.Produto;
import br.com.infnet.proj.apiestoque.model.domain.Referencia;
import br.com.infnet.proj.apiestoque.model.domain.service.ReferenciaService;

@Component
@Order(2)
public class ReferenciaLoader implements ApplicationRunner{

	@Autowired
	private ReferenciaService referenciaService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Produto produto = new Produto();
			produto.setId(1);
			

			
			Referencia referencia = new Referencia();
			referencia.setNome("ab623636");
			referencia.setProduto(produto);
			referenciaService.incluir(referencia);
			
			Referencia referencia2 = new Referencia();
			referencia2.setNome("ab62");
			referencia2.setProduto(produto);
			referenciaService.incluir(referencia2);
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	

}
