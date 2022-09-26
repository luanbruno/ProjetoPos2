package br.com.infnet.proj.apiestoque.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TProduto",
uniqueConstraints = @UniqueConstraint(columnNames={"cd_barra"})
)
@Inheritance(strategy = InheritanceType.JOINED)

public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@ManyToOne
	@JoinColumn(name = "idFabricante")
	private Fabricante fabricante;
	
	@ManyToOne
	@JoinColumn(name = "idGrupo")
	private Grupo grupo;
	
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true) 
	@JoinColumn(name="idProdutoLo")
	@JsonManagedReference
	private List<Local> locais;
	
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true) 
	@JoinColumn(name="idProdutoRe")
	@JsonManagedReference
	private List<Referencia> referencias;
	
	@ManyToOne
	@JoinColumn(name = "idUnidade")
	private Unidade unidade;
		
	
	public List<Referencia> getReferencias() {
		return referencias;
	}
	public void setReferencias(List<Referencia> referencias) {
		this.referencias = referencias;
	}
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
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
