package br.com.infnet.proj.apiestoque.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.proj.apiestoque.model.domain.Fabricante;
import br.com.infnet.proj.apiestoque.model.domain.Grupo;
import br.com.infnet.proj.apiestoque.model.domain.Produto;
import br.com.infnet.proj.apiestoque.model.domain.Unidade;
import br.com.infnet.proj.apiestoque.model.domain.service.FabricanteService;
import br.com.infnet.proj.apiestoque.model.domain.service.GrupoService;
import br.com.infnet.proj.apiestoque.model.domain.service.ProdutoService;
import br.com.infnet.proj.apiestoque.model.domain.service.UnidadeService;

@Component
@Order(1)
public class ProdutoLoader implements ApplicationRunner{

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private FabricanteService fabricanteService;
	
	@Autowired
	private GrupoService grupoService;
	
	@Autowired
	private UnidadeService unindadeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			
			Fabricante fabricante = new Fabricante();
			fabricante.setNome("helair");
			fabricante.setSigla("hf");
			fabricanteService.incluir(fabricante);
			Fabricante fabricante2 = new Fabricante();
			fabricante2.setNome("dni");
			fabricante2.setSigla("dni");
			fabricanteService.incluir(fabricante2);
			
			Grupo grupo = new Grupo();
			grupo.setNome("acessorios");
			grupoService.incluir(grupo);
			
			Unidade unidade = new Unidade();
			unidade.setMedida("Cx");
			unidade.setNome("caixa");
			unindadeService.incluir(unidade);
			
			Produto produto = new Produto();
			produto.setNome("teste");
			produto.setCd_barra("44488448488");
			produto.setAplicacao("bateria");
			produto.setFabricante(fabricante);
			produto.setGrupo(grupo);
			produto.setUnidade(unidade);
			produtoService.incluir(produto);
			
			Produto produto2 = new Produto();
			produto2.setNome("test2e");
			produto2.setCd_barra("4334488448488");
			produto2.setAplicacao("bateria1");
			produto2.setFabricante(fabricante2);
			produto2.setGrupo(grupo);
			produto2.setUnidade(unidade);
			produtoService.incluir(produto2);
			
			System.out.println("Processo de inclusao finalizado.");	
		} catch(Exception e) {
			System.out.println("[ERRO] Impossivel realizar a inclusao do Produto ");			
		}
		
	}
	
	

}
