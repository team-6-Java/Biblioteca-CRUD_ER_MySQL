package com.http.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.biblioteca.dao.IMensajeDAO;
import com.http.biblioteca.dto.Mensaje;

@Service
public class MensajeService implements IMensajeService {

	@Autowired
	IMensajeDAO iMensajeDAO;

	
	@Override
	public List<Mensaje> listarMensajes() {
		// TODO Auto-generated method stub
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje guardarMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public Mensaje MensajeXID(Long id) {
		// TODO Auto-generated method stub
		return iMensajeDAO.findById(id).get();
	}

	@Override
	public Mensaje actualizarMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public void eliminarMensaje(Long id) {
		// TODO Auto-generated method stub
		iMensajeDAO.deleteById(id);
	}


}