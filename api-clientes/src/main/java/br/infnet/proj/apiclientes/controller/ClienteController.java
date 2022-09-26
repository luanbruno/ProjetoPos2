package br.infnet.proj.apiclientes.controller;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.proj.apiclientes.model.domain.Cliente;
import br.infnet.proj.apiclientes.model.domain.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	private static final Logger LOGGER = Logger.getLogger(ClienteController.class.getName());
	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "/listar")
	public ResponseEntity<List<Cliente>> obterLista() {
		LOGGER.info("cliente listado");
		List<Cliente> all =  clienteService.obterLista();
		return ResponseEntity.ok(all);
	}

	@PostMapping(value = "/incluir")
	public ResponseEntity<Map<String,String>> incluir(@RequestBody Cliente cliente) {
		LOGGER.info("cliente cadastrado");
		clienteService.incluir(cliente);
		return ResponseEntity.ok(Map.of("menssagem","savar"));
}

	@DeleteMapping(value = "/{id}/excluir")
	public ResponseEntity<Map<String,String>> excluir(@PathVariable Integer id) {
		LOGGER.info("cliente excluido");
		clienteService.excluir(id);
		return null;
	}
		
}
