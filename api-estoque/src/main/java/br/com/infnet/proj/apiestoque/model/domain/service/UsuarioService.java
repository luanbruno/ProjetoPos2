package br.com.infnet.proj.apiestoque.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.proj.apiestoque.model.domain.Usuario;
import br.com.infnet.proj.apiestoque.model.domain.repository.UsuarioRepository;
@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);

	}
	public List<Usuario> obterLista(){
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);

	}
}
