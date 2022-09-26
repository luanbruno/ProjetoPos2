package br.edu.proj.sisEstoque.modal.domain;

public class Fornecedor {


	private Integer id;	
	private String nome;
	private String email;
	private String cnpj;
	private String ins_estadual;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIns_estadual() {
		return ins_estadual;
	}
	public void setIns_estadual(String ins_estadual) {
		this.ins_estadual = ins_estadual;
	}
	
	
}
