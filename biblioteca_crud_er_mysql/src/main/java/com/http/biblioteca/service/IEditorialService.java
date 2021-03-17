package com.http.biblioteca.service;

import java.util.List;

import com.http.biblioteca.dto.Editorial;

public interface IEditorialService {
	//Metodos del CRUD
		public List<Editorial> listarEditorials(); //Listar All 
		
		public Editorial guardarEditorial(Editorial editorial);	//CREATE
		
		public Editorial EditorialXID(Long id); //READ
		
		public Editorial actualizarEditorial(Editorial editorial); //UPDATE
		
		public void eliminarEditorial(Long id);//DELETE
}
