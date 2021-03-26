package com.http.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.biblioteca.dao.IEditorialDAO;
import com.http.biblioteca.dto.Editorial;

@Service
public class EditorialService implements IEditorialService {

	@Autowired
	IEditorialDAO iEditorialDAO;
	

	@Override
	public List<Editorial> listarEditorials() {
		// TODO Auto-generated method stub
		return iEditorialDAO.findAll();
	}

	@Override
	public Editorial guardarEditorial(Editorial editorial) {
		// TODO Auto-generated method stub
		return iEditorialDAO.save(editorial);
	}

	@Override
	public Editorial EditorialXID(Long id) {
		// TODO Auto-generated method stub
		return iEditorialDAO.findById(id).get();
	}

	@Override
	public Editorial actualizarEditorial(Editorial editorial) {
		// TODO Auto-generated method stub
		return iEditorialDAO.save(editorial);
	}

	@Override
	public void eliminarEditorial(Long id) {
		// TODO Auto-generated method stub
		iEditorialDAO.deleteById(id);
	}

}