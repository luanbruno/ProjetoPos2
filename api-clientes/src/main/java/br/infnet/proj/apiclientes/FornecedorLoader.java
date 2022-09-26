package br.infnet.proj.apiclientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.infnet.proj.apiclientes.model.domain.Fornecedor;
import br.infnet.proj.apiclientes.model.domain.service.FornecedorService;

@Component
@Order(2)
public class FornecedorLoader implements ApplicationRunner{

	@Autowired
	private FornecedorService fornecedorService;
		
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			
			
			Fornecedor fornecedor = new Fornecedor();
			
			fornecedor.setCnpj("123456000123");
			fornecedor.setEmail("for@for.com");
			fornecedor.setIns_estadual("1297854845");
			fornecedor.setNome("Venda Tudo");
			fornecedorService.incluir(fornecedor);
			
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	
	

}
