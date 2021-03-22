package com.http.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.biblioteca.dto.Editorial;
import com.http.biblioteca.service.EditorialService;

@RestController
@RequestMapping("/biblioteca")
public class EditorialController {
	@Autowired
	EditorialService editorialService;
	
	
	@GetMapping("/editorial")
	public List<Editorial> listarEditorials(){
		return editorialService.listarEditorials();
	}
	
	@PostMapping("/editorial")
	public Editorial salvarEditorial(@RequestBody Editorial editorial) {	
		return editorialService.guardarEditorial(editorial);
	}
	
	@GetMapping("/editorial/{id}")
	public Editorial EditorialXID(@PathVariable(name="id") Long id) {
		
		Editorial editorial_xid= new Editorial();
		
		editorial_xid=editorialService.EditorialXID(id);
		
		//System.out.println("Editorial XID: "+editorial_xid);
		
		return editorial_xid;
	}
	
	@PutMapping("/editorial/{id}")
	public Editorial actualizarEditorial(@PathVariable(name="id")Long id,@RequestBody Editorial editorial) {
		
		Editorial editorial_seleccionado= new Editorial();
		Editorial editorial_actualizado= new Editorial();
		
		editorial_seleccionado= editorialService.EditorialXID(id);
		
		editorial_seleccionado.setNombre(editorial.getNombre());
		
		editorial_actualizado = editorialService.actualizarEditorial(editorial_seleccionado);
		
		//System.out.println("El Editorial actualizado es: "+ editorial_actualizado);
		
		return editorial_actualizado;
	}
	
	@DeleteMapping("/editorial/{id}")
	public void eleiminarEditorial(@PathVariable(name="id")Long id) {
		editorialService.eliminarEditorial(id);
	}
	
}