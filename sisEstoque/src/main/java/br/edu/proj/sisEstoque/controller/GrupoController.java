package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.proj.sisEstoque.modal.domain.Grupo;
import br.edu.proj.sisEstoque.modal.service.GrupoService;
@Controller
public class GrupoController {
	private static final Logger LOGGER = Logger.getLogger(GrupoController.class.getName());

	@Autowired
	private GrupoService grupoService;
	
	@GetMapping(value = "/grupo")
	public String cadastro() {
		LOGGER.info("grupo tela cadastro");
		return "grupo/cadastro";
	}
	@GetMapping(value = "/grupos")
	public String lista(Model model) {
		LOGGER.info("grupo tela lista");
		model.addAttribute("lista",grupoService.obterLista());
		return "grupo/lista";
		
	}
	
	@PostMapping(value = "/grupo/incluir")
	public String incluir(Model model,Grupo grupo) {
		LOGGER.info("grupo cadastro");
		grupoService.incluir(grupo);
		return "redirect:/grupos";
		
	}
	@GetMapping(value = "/grupo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("grupo tela excluir");
		grupoService.excluir(id);
		return "redirect:/grupos";
		
	}
}
