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

import com.http.biblioteca.dto.Prestamo;
import com.http.biblioteca.service.PrestamoService;



@RestController
@RequestMapping("/biblioteca")
public class PrestamoController {

	@Autowired
	PrestamoService PrestamoService;
	
	@GetMapping("/prestamo")
	public List<Prestamo> listarPrestamo(){
		return PrestamoService.listarPrestamo();
	}
	
	@PostMapping("/prestamo")
	public Prestamo salvarPrestamo(@RequestBody Prestamo Prestamo) {
		return PrestamoService.guardarPrestamo(Prestamo);
	}
	
	@GetMapping("/prestamo/{id}")
	public Prestamo PrestamoXID(@PathVariable(name="id") Long id) {
		
		Prestamo Prestamo_xid= new Prestamo();
		
		Prestamo_xid=PrestamoService.PrestamoXID(id);
		
		//System.out.println("Prestamo XID: "+Prestamo_xid);
		
		return Prestamo_xid;
	}
	
	@PutMapping("/prestamo/{id}")
	public Prestamo actualizarPrestamo(@PathVariable(name="id")Long id,@RequestBody Prestamo Prestamo) {
		
		Prestamo Prestamo_seleccionado= new Prestamo();
		Prestamo Prestamo_actualizado= new Prestamo();
		
		Prestamo_seleccionado= PrestamoService.PrestamoXID(id);
		
		Prestamo_seleccionado.setId(Prestamo.getId());	
		Prestamo_seleccionado.setFecha_prestamo(Prestamo.getFecha_prestamo());
		Prestamo_seleccionado.setFecha_devolucion(Prestamo.getFecha_devolucion());
		Prestamo_seleccionado.setValoracion_libro(Prestamo.getValoracion_libro());
		
		
		Prestamo_actualizado = PrestamoService.actualizarPrestamo(Prestamo_seleccionado);
		
		//System.out.println("El Prestamo actualizado es: "+ Prestamo_actualizado);
		
		return Prestamo_actualizado;
	}
	
	@DeleteMapping("/prestamo/{id}")
	public void eliminarPrestamo(@PathVariable(name="id")Long id) {
		PrestamoService.eliminarPrestamo(id);
	}
	
}