package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.proj.sisEstoque.modal.domain.Cliente;
import br.edu.proj.sisEstoque.modal.service.ClienteService;
@Controller
public class ClienteController {
	
	private static final Logger LOGGER = Logger.getLogger(ClienteController.class.getName());
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/cliente")
	public String cadastro() {
		LOGGER.info("cliente tela cadastro");
		return "cliente/cadastro";
	}
	@GetMapping(value = "/clientes")
	public String lista(Model model) {
		LOGGER.info("cliente tela lista");
		model.addAttribute("lista",clienteService.obterLista());
		return "cliente/lista";
		
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Model model,Cliente cliente) {
		LOGGER.info("cliente cadastro");
		clienteService.incluir(cliente);
		return "redirect:/clientes";
		
	}
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("cliente tela excluir");
		clienteService.excluir(id);
		return "redirect:/clientes";
		
	}
}
