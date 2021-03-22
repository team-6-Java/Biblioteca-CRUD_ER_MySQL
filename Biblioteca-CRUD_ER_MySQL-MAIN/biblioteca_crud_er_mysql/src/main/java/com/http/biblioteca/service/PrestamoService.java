package com.http.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.biblioteca.service.PrestamoService;

import com.http.biblioteca.dao.IPrestamoDAO;
import com.http.biblioteca.dto.Prestamo;

@Service
public class PrestamoService implements IPrestamoService {

	@Autowired
	IPrestamoDAO iPrestamoDAO;
	

	
	@Override
	public List<Prestamo> listarPrestamo() {
		// TODO Auto-generated method stub
		return iPrestamoDAO.findAll();
	}

	@Override
	public Prestamo guardarPrestamo(Prestamo Prestamo) {
		// TODO Auto-generated method stub
		return iPrestamoDAO.save(Prestamo);
	}

	@Override
	public Prestamo PrestamoXID(Long id) {
		// TODO Auto-generated method stub
		return iPrestamoDAO.findById(id).get();
	}

	@Override
	public Prestamo actualizarPrestamo(Prestamo Prestamo) {
		// TODO Auto-generated method stub
		return iPrestamoDAO.save(Prestamo);
	}

	@Override
	public void eliminarPrestamo(Long id) {
		// TODO Auto-generated method stub
		iPrestamoDAO.deleteById(id);
	}

}