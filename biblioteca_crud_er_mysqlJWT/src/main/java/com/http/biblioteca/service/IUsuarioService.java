package com.http.biblioteca.service;

import java.util.List;

import com.http.biblioteca.dto.Usuario;

public interface IUsuarioService {

	
	//Metodos del CRUD
	public List<Usuario> listarUsuario(); //Listar All 
	
	public Usuario guardarUsuario(Usuario Usuario);	//CREATE
	
	public Usuario UsuarioUsername(String username); //READ
	
	public Usuario actualizarUsuario(Usuario Usuario); //UPDATE
	
	public void eliminarUsuario(String username);//DELETE
}