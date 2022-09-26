package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.proj.sisEstoque.modal.domain.Produto;
import br.edu.proj.sisEstoque.modal.domain.Referencia;
import br.edu.proj.sisEstoque.modal.service.ProdutoService;
import br.edu.proj.sisEstoque.modal.service.ReferenciaService;
@Controller
public class ReferenciaController {
	private static final Logger LOGGER = Logger.getLogger(ReferenciaController.class.getName());
	@Autowired
	private ReferenciaService referenciaService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/referencia")
	public String cadastro(Model model, @RequestParam Integer idproduto) {
		LOGGER.info("referencia tela cadastro");
		Produto produto = produtoService.obterPorId(idproduto);
		model.addAttribute("produto", produto);
		return "referencia/cadastro";
	}
	@GetMapping(value = "/referencias")
	public String lista(Model model, @RequestParam Integer idproduto) {
		LOGGER.info("referencia tela lista");
		Produto produto = produtoService.obterPorId(idproduto);
		model.addAttribute("lista",referenciaService.obterLista(idproduto));
		model.addAttribute("produto", produto);
		return "referencia/lista";
		
	}
	
	@PostMapping(value = "/referencia/incluir")
	public String incluir(Model model,Referencia referencia) {
		LOGGER.info("referencia cadastro");
		referenciaService.incluir(referencia);
		return "redirect:/produtos";
		
	}
	@GetMapping(value = "/referencia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("referencia tela excluir");
		referenciaService.excluir(id);
		return "redirect:/produtos";
		
	}
	
}
