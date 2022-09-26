package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.proj.sisEstoque.modal.domain.Fornecedor;
import br.edu.proj.sisEstoque.modal.service.FornecedorService;
@Controller
public class FornecedorController {
	private static final Logger LOGGER = Logger.getLogger(FornecedorController.class.getName());
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping(value = "/fornecedor")
	public String cadastro() {
		LOGGER.info("fornecedor tela cadastro");
		return "fornecedor/cadastro";
	}
	@GetMapping(value = "/fornecedores")
	public String lista(Model model) {
		LOGGER.info("fornecedor de listar");
		model.addAttribute("lista",fornecedorService.obterLista());
		return "fornecedor/lista";
		
	}
	
	@PostMapping(value = "/fornecedor/incluir")
	public String incluir(Model model,Fornecedor fornecedor) {
		LOGGER.info("fornecedor cadastro");
		fornecedorService.incluir(fornecedor);
		return "redirect:/fornecedores";
		
	}
	@GetMapping(value = "/fornecedor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("fornecedor de excluir");
		fornecedorService.excluir(id);
		return "redirect:/fornecedores";
		
	}
}
