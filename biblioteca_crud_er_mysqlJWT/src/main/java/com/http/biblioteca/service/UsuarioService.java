package com.http.biblioteca.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.biblioteca.dao.IUsuarioDAO;
import com.http.biblioteca.dto.Usuario;


@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	IUsuarioDAO iUsuarioDao;
	
	public List<Usuario> listarUsuario() {
		return iUsuarioDao.findAll();
	}

	public Usuario guardarUsuario(Usuario Usuario) {
		return iUsuarioDao.save(Usuario);
	}

	public Usuario UsuarioUsername(String username) {
		return iUsuarioDao.findById(username).get();
	}

	public Usuario actualizarUsuario(Usuario Usuario) {
		return iUsuarioDao.save(Usuario);
	}

	public void eliminarUsuario(String username) {
		iUsuarioDao.deleteById(username);
	}

	
		
	}

	
	
