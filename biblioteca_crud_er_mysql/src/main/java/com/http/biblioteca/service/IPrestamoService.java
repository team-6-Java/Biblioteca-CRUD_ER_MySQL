
package com.http.biblioteca.service;

import java.util.List;

import com.http.biblioteca.dto.Prestamo;

public interface IPrestamoService {

	
	//Metodos del CRUD
	public List<Prestamo> listarPrestamo(); //Listar All 
	
	public Prestamo guardarPrestamo(Prestamo Prestamo);	//CREATE
	
	public Prestamo PrestamoXID(Long id); //READ
	
	public Prestamo actualizarPrestamo(Prestamo Prestamo); //UPDATE
	
	public void eliminarPrestamo(Long id);//DELETE
}