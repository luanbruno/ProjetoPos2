package br.edu.proj.sisEstoque.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.proj.sisEstoque.modal.domain.Cliente;
import br.edu.proj.sisEstoque.modal.domain.Fabricante;
import br.edu.proj.sisEstoque.modal.domain.Grupo;
import br.edu.proj.sisEstoque.modal.domain.Local;
import br.edu.proj.sisEstoque.modal.domain.Produto;
import br.edu.proj.sisEstoque.modal.domain.Referencia;
import br.edu.proj.sisEstoque.modal.domain.Unidade;

@FeignClient(value = "estoque", path = "/api/")
public interface ConexaoClients {
	
	//cliente lista
	//@GetMapping(value = "cliente/listar")
	//public List<Cliente> obterListaCliente();
	
	
 // fabricante
	@GetMapping(value = "fabricante/listar")
	public List<Fabricante> obterLista();

	@PostMapping(value = "fabricante/incluir")
	public void incluir(@RequestBody Fabricante fabricante);

	@DeleteMapping(value = "fabricante/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	//grupo
	@GetMapping(value = "grupo/listar")
	public List<Grupo> obterListaGrupo();

	@PostMapping(value = "grupo/incluir")
	public void incluir(@RequestBody Grupo grupo);

	@DeleteMapping(value = "grupo/{id}/excluir")
	public void excluirGrupo(@PathVariable Integer id);
	
	//local
	
	@GetMapping(value = "local/listar")
	public List<Local> obterListaLocal();

	@PostMapping(value = "local/incluir")
	public void incluir(@RequestBody Local local);

	@DeleteMapping(value = "local/{id}/excluir")
	public void excluirLocal(@PathVariable Integer id);
	
	@GetMapping("local/listar/{idProduto}")
    public List<Local> obterListaLocal(@PathVariable Integer idProduto);
	
	//produto
	
	@GetMapping(value = "produto/listar")
	public List<Produto> obterListaProduto();

	@PostMapping(value = "produto/incluir")
	public void incluir(@RequestBody Produto produto);

	@DeleteMapping(value = "produto/{id}/excluir")
	public void excluirProduto(@PathVariable Integer id);
	
	@GetMapping(value="produto/obter/{idProduto}")
	public Produto obterPorIdProduto(@PathVariable Integer idProduto);
	
	//referencia
	
	@GetMapping(value = "referencia/listar")
	public List<Referencia> obterListaReferencia();

	@PostMapping(value = "referencia/incluir")
	public void incluir(@RequestBody Referencia referencia);

	@DeleteMapping(value = "referencia/{id}/excluir")
	public void excluirReferencia(@PathVariable Integer id);
	
	@GetMapping("referencia/listar/{idProduto}")
    public List<Referencia> obterListaReferencia(@PathVariable Integer idProduto);
	
	// unidade
	
	@GetMapping(value = "unidade/listar")
	public List<Unidade> obterListaUnidade();

	@PostMapping(value = "unidade/incluir")
	public void incluir(@RequestBody Unidade unidade);

	@DeleteMapping(value = "unidade/{id}/excluir")
	public void excluirUnidade(@PathVariable Integer id);

	
	
}
