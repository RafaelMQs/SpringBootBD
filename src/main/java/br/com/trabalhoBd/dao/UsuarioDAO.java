package br.com.trabalhoBd.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.trabalhoBd.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	public Usuario findByEmailAndSenha(String email, String senha);
}
