package com.http.biblioteca.service;

import java.util.List;

import com.http.biblioteca.dto.Autor;

public interface IAutorService {


	//Metodos del CRUD
	public List<Autor> listarAutor(); //Listar All 
	
	public Autor guardarAutor(Autor autor);	//CREATE
	
	public Autor AutorXID(Long id); //READ
	
	public Autor actualizarAutor(Autor autor); //UPDATE
	
	public void eliminarAutor(Long id);//DELETE
	
}