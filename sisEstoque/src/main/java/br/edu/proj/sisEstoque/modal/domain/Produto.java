package br.edu.proj.sisEstoque.modal.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Produto {

	public Integer id;
	public String cd_barra;
	public String nome;
	public String aplicacao;
	public Boolean status;
	public LocalDateTime d_cadatro;
		
	public Produto() {
		this.setD_cadatro(LocalDateTime.now());
		this.setStatus(true);
	}
	
	private Fabricante fabricante;
	
	
	private Grupo grupo;
	
	
	private List<Local> locais;
	
	
	private List<Referencia> referencias;
	
	
	private Unidade unidade;
		
	
	public List<Referencia> getReferencias() {
		return referencias;
	}
	public void setReferencias(List<Referencia> referencias) {
		this.referencias = referencias;
	}
	
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCd_barra() {
		return cd_barra;
	}
	public void setCd_barra(String cd_barra) {
		this.cd_barra = cd_barra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDateTime getD_cadatro() {
		return d_cadatro;
	}
	public void setD_cadatro(LocalDateTime d_cadatro) {
		this.d_cadatro = d_cadatro;
	}
}
