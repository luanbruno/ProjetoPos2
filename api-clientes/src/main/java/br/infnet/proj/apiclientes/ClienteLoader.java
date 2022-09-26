package br.infnet.proj.apiclientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.infnet.proj.apiclientes.model.domain.Cliente;
import br.infnet.proj.apiclientes.model.domain.service.ClienteService;

@Component
@Order(1)
public class ClienteLoader implements ApplicationRunner{

	@Autowired
	private ClienteService clienteService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			
		
			
			Cliente cliente = new Cliente();
			cliente.setCpf("12878014475");
			cliente.setEmail("lua@luan.com");
			cliente.setNome("lua");
			clienteService.incluir(cliente);
			
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	
	

}
