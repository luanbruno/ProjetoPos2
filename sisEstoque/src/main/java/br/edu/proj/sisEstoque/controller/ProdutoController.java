package br.edu.proj.sisEstoque.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.proj.sisEstoque.modal.domain.Produto;
import br.edu.proj.sisEstoque.modal.service.FabricanteService;
import br.edu.proj.sisEstoque.modal.service.GrupoService;
import br.edu.proj.sisEstoque.modal.service.ProdutoService;
import br.edu.proj.sisEstoque.modal.service.UnidadeService;
@Controller
public class ProdutoController {
	private static final Logger LOGGER = Logger.getLogger(ProdutoController.class.getName());
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private FabricanteService fabricanteService;
	
	@Autowired
	private GrupoService grupoService;
	
	@Autowired
	private UnidadeService unidadeService;
	
	
	@GetMapping(value = "/produto")
	public String cadastro(Model model) {
		LOGGER.info("produto tela cadastro");
		model.addAttribute("fabricante_lis", fabricanteService.obterLista());
		model.addAttribute("grupo_lis", grupoService.obterLista());
		model.addAttribute("unidade_lis", unidadeService.obterLista());
		return "produto/cadastro";
	}
	@GetMapping(value = "/produtos")
	public String lista(Model model) {
		LOGGER.info("produto de listar");
		model.addAttribute("lista",produtoService.obterLista());
		
		return "produto/lista";
		
	}
	
	@PostMapping(value = "/produto/incluir")
	public String incluir(Model model,Produto produto) {
		LOGGER.info("produto cadastro");
		produtoService.incluir(produto);
		return "redirect:/produtos";
		
	}
	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		LOGGER.info("produto de excluir");
		produtoService.excluir(id);
		return "redirect:/produtos";
		
	}
}
