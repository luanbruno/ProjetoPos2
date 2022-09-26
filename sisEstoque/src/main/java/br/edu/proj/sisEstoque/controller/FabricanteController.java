package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.proj.sisEstoque.modal.domain.Fabricante;
import br.edu.proj.sisEstoque.modal.service.FabricanteService;
@Controller
public class FabricanteController {
	private static final Logger LOGGER = Logger.getLogger(FabricanteController.class.getName());
	@Autowired
	private FabricanteService fabricanteService;
	
	@GetMapping(value = "/fabricante")
	public String cadastro() {
		LOGGER.info("Fabricante tela cadastro");
		return "fabricante/cadastro";
	}
	@GetMapping(value = "/fabricantes")
	public String lista(Model model) {
		LOGGER.info("pedido de listar");
		model.addAttribute("lista",fabricanteService.obterLista());
		return "fabricante/lista";
		
	}
	
	@PostMapping(value = "/fabricante/incluir")
	public String incluir(Model model,Fabricante fabricante) {
		LOGGER.info("pedido de cadastro");
		fabricanteService.incluir(fabricante);
		return "redirect:/fabricantes";
		
	}
	@GetMapping(value = "/fabricante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("pedido de excluir");
		fabricanteService.excluir(id);
		return "redirect:/fabricantes";
		
	}
}
