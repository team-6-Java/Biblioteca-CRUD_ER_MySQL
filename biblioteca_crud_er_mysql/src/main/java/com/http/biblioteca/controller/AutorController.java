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

import com.http.biblioteca.dto.Autor;
import com.http.biblioteca.service.AutorService;

@RestController
@RequestMapping("/biblioteca")
public class AutorController {

	@Autowired
	AutorService autorService;
	
	@GetMapping("/autor")
	public List<Autor> listarAutor(){
		return autorService.listarAutor();
	}
	
	@PostMapping("/autor")
	public Autor salvarAutor(@RequestBody Autor autor) {
		
		return autorService.guardarAutor(autor);
	}
	
	@GetMapping("/autor/{id}")
	public Autor AutorXID(@PathVariable(name="id") Long id) {
		
		Autor Autor_xid= new Autor();
		
		Autor_xid=autorService.AutorXID(id);
		
		System.out.println("Autor XID: "+Autor_xid);
		
		return Autor_xid;
	}
	
	@PutMapping("/autor/{id}")
	public Autor actualizarAutor(@PathVariable(name="id")Long id,@RequestBody Autor autor) {
		
		Autor autor_seleccionado= new Autor();
		Autor autor_actualizado= new Autor();
		
		autor_seleccionado= autorService.AutorXID(id);
		autor_seleccionado.setNombre(autor.getNombre());
		autor_seleccionado.setApellido(autor.getApellido());

		
		autor_actualizado = autorService.actualizarAutor(autor_seleccionado);
		
		System.out.println("El Autor actualizado es: "+ autor_actualizado);
		
		return autor_actualizado;
	}
	
	@DeleteMapping("/autor/{id}")
	public void eleiminarAutor(@PathVariable(name="id")Long id) {
		autorService.eliminarAutor(id);
	}
	
}