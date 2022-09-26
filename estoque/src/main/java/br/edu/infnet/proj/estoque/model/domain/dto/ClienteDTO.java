package br.edu.infnet.proj.estoque.model.domain.dto;

import java.io.Serializable;
import java.util.List;

public class ClienteDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;	
	private String nome;
	private String email;
	private String cpf;
	private List<Long> idClientes;
	
		
	
	public List<Long> getIdClientes() {
		return idClientes;
	}
	public void setIdClientes(List<Long> idClientes) {
		this.idClientes = idClientes;
	}
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
