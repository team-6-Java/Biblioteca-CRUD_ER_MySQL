package com.http.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.biblioteca.dao.IAutorDAO;
import com.http.biblioteca.dto.Autor;

@Service
public class AutorService implements IAutorService {

	@Autowired
	IAutorDAO iAutorDao;
	
	public List<Autor> listarAutor() {
		return iAutorDao.findAll();
	}

	public Autor guardarAutor(Autor autor) {
		return iAutorDao.save(autor);
	}

	public Autor AutorXID(Long id) {
		return iAutorDao.findById(id).get();
	}

	public Autor actualizarAutor(Autor autor) {
		return iAutorDao.save(autor);
	}

	public void eliminarAutor(Long id) {
		iAutorDao.deleteById(id);
	}


}