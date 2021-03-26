package com.http.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.biblioteca.service.LibroService;

import com.http.biblioteca.dao.ILibroDAO;
import com.http.biblioteca.dto.Libro;



@Service
public class LibroService implements ILibroService {

	@Autowired
	ILibroDAO iLibroDAO;

	@Override
	public List<Libro> listarLibro() {
		// TODO Auto-generated method stub
		return iLibroDAO.findAll();
	}

	@Override
	public Libro guardarLibro(Libro Libro) {
		// TODO Auto-generated method stub
		return iLibroDAO.save(Libro);
	}

	@Override
	public Libro LibroXID(Long id) {
		// TODO Auto-generated method stub
		return iLibroDAO.findById(id).get();
	}

	@Override
	public Libro actualizarLibro(Libro Libro) {
		// TODO Auto-generated method stub
		return iLibroDAO.save(Libro);
	}

	@Override
	public void eliminarLibro(Long id) {
		// TODO Auto-generated method stub
		iLibroDAO.deleteById(id);
	}

}
	


