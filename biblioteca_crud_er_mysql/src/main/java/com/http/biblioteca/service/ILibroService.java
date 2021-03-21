
package com.http.biblioteca.service;

import java.util.List;

import com.http.biblioteca.dto.Libro;

public interface ILibroService {

	
	//Metodos del CRUD
	public List<Libro> listarLibro(); //Listar All 
	
	public Libro guardarLibro(Libro Libro);	//CREATE
	
	public Libro LibroXID(Long id); //READ
	
	public Libro actualizarLibro(Libro Libro); //UPDATE
	
	public void eliminarLibro(Long id);//DELETE
}