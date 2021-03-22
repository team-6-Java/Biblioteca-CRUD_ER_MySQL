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

import com.http.biblioteca.dto.Libro;
import com.http.biblioteca.service.LibroService;

@RestController
@RequestMapping("/biblioteca")
public class LibroController {

	@Autowired
	LibroService LibroService;
	
	@GetMapping("/libro")
	public List<Libro> listarLibro(){
		return LibroService.listarLibro();
	}
	
	@PostMapping("/libro")
	public Libro salvarLibro(@RequestBody Libro Libro) {
		
		return LibroService.guardarLibro(Libro);
	}
	
	@GetMapping("/libro/{id}")
	public Libro LibroXID(@PathVariable(name="id") Long id) {
		
		Libro Libro_xid= new Libro();
		
		Libro_xid=LibroService.LibroXID(id);
		
		//System.out.println("Libro id: "+Libro_xid);
		
		return Libro_xid;
	}
	
	@PutMapping("/libro/{id}")
	public Libro actualizarLibro(@PathVariable(name="id")Long id,@RequestBody Libro Libro) {
		
		Libro Libro_seleccionado= new Libro();
		Libro Libro_actualizado= new Libro();
		
		Libro_seleccionado= LibroService.LibroXID(id);
		
		
		Libro_seleccionado.setTitulo(Libro.getTitulo());
		Libro_seleccionado.setIsbn(Libro.getIsbn());		
		Libro_seleccionado.setTematica(Libro.getTematica());
		Libro_seleccionado.setEstado(Libro.getEstado());
		Libro_seleccionado.setImagen(Libro.getImagen());
		Libro_seleccionado.setPaginas(Libro.getPaginas());
		Libro_seleccionado.setDescripcion(Libro.getDescripcion());
		Libro_seleccionado.setVeces_prestado(Libro.getVeces_prestado());
		//Libro_seleccionado.setUsuario(Libro.getUsuario());
		

		
		Libro_actualizado = LibroService.actualizarLibro(Libro_seleccionado);
		
		//System.out.println("El Libro actualizado es: "+ Libro_actualizado);
		
		return Libro_actualizado;
	}
	
	@DeleteMapping("/libro/{id}")
	public void eliminarLibro(@PathVariable(name="id")Long id) {
		LibroService.eliminarLibro(id);
	}
	
}