package com.http.biblioteca.service;

import java.util.List;

import com.http.biblioteca.dto.Mensaje;

public interface IMensajeService {
	//Metodos del CRUD
		public List<Mensaje> listarMensajes(); //Listar All 
		
		public Mensaje guardarMensaje(Mensaje mensaje);	//CREATE
		
		public Mensaje MensajeXID(Long id); //READ
		
		public Mensaje actualizarMensaje(Mensaje mensaje); //UPDATE
		
		public void eliminarMensaje(Long id);//DELETE
}