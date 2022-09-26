package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.proj.sisEstoque.modal.domain.Unidade;
import br.edu.proj.sisEstoque.modal.service.UnidadeService;
@Controller
public class UnidadeController {
	private static final Logger LOGGER = Logger.getLogger(UnidadeController.class.getName());
	@Autowired
	private UnidadeService unidadeService;
	
	@GetMapping(value = "/unidade")
	public String cadastro() {
		LOGGER.info("unidade tela cadastro");
		return "unidade/cadastro";
	}
	@GetMapping(value = "/unidades")
	public String lista(Model model) {
		LOGGER.info("unidade lista");
		model.addAttribute("lista",unidadeService.obterLista());
		return "unidade/lista";
		
	}
	
	@PostMapping(value = "/unidade/incluir")
	public String incluir(Model model,Unidade unidade) {
		LOGGER.info("unidade cadastro");
		unidadeService.incluir(unidade);
		return "redirect:/unidades";
		
	}
	@GetMapping(value = "/unidade/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("unidade excluir");
		unidadeService.excluir(id);
		return "redirect:/unidades";
		
	}
}
