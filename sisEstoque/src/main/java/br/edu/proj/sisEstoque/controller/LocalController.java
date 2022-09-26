package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.proj.sisEstoque.modal.domain.Local;
import br.edu.proj.sisEstoque.modal.domain.Produto;
import br.edu.proj.sisEstoque.modal.service.LocalService;
import br.edu.proj.sisEstoque.modal.service.ProdutoService;
@Controller
public class LocalController {
	private static final Logger LOGGER = Logger.getLogger(LocalController.class.getName());

	@Autowired
	private LocalService localService;
	
	@Autowired
	private ProdutoService produtoService;
	
	
	@GetMapping(value = "/local")
	public String cadastro(Model model, @RequestParam Integer idproduto) {
		LOGGER.info("local tela cadastro");
		Produto produto = produtoService.obterPorId(idproduto);
		model.addAttribute("produto", produto);
		return "local/cadastro";
	}
	@GetMapping(value = "/locais")
	public String lista(Model model,@RequestParam Integer idproduto) {
		LOGGER.info("local tela lista");
		Produto produto = produtoService.obterPorId(idproduto);
		model.addAttribute("lista",localService.obterLista(idproduto));
		model.addAttribute("produto", produto);
		return "local/lista";
		
	}
	
	@PostMapping(value = "/local/incluir")
	public String incluir(Model model,Local local) {
		LOGGER.info("local cadastro");
		localService.incluir(local);
		return "redirect:/produtos";
		
	}
	@GetMapping(value = "/local/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("local tela excluir");
		localService.excluir(id);
		return "redirect:/produtos";
		
	}
}
