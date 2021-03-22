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

import com.http.biblioteca.dto.Mensaje;
import com.http.biblioteca.service.MensajeService;

@RestController
@RequestMapping("/biblioteca")
public class MensajeController {


	@Autowired
	MensajeService mensajeService;
	
	@GetMapping("/mensaje")
	public List<Mensaje> listarMensajes(){
		return mensajeService.listarMensajes();
	}
	
	@PostMapping("/mensaje")
	public Mensaje salvarMensaje(@RequestBody Mensaje mensaje) {
		return mensajeService.guardarMensaje(mensaje);
	}
	
	@GetMapping("/mensaje/{id}")
	public Mensaje MensajeXID(@PathVariable(name="id") Long id) {
		
		Mensaje Mensaje_xid= new Mensaje();
		
		Mensaje_xid=mensajeService.MensajeXID(id);
		
		//System.out.println("Mensaje XID: "+Mensaje_xid);
		
		return Mensaje_xid;
	}
	
	@PutMapping("/mensaje/{id}")
	public Mensaje actualizarMensaje(@PathVariable(name="id")Long id,@RequestBody Mensaje mensaje) {
		
		Mensaje Mensaje_seleccionado= new Mensaje();
		Mensaje Mensaje_actualizado= new Mensaje();
		
		Mensaje_seleccionado= mensajeService.MensajeXID(id);
		
		Mensaje_seleccionado.setUsuario1(mensaje.getUsuario1());
		Mensaje_seleccionado.setUsuario2(mensaje.getUsuario2());
		Mensaje_seleccionado.setMensaje(mensaje.getMensaje());
		
		Mensaje_actualizado = mensajeService.actualizarMensaje(Mensaje_seleccionado);
		
		//System.out.println("El Mensaje actualizado es: "+ Mensaje_actualizado);
		
		return Mensaje_actualizado;
	}
	
	@DeleteMapping("/mensaje/{id}")
	public void eliminarMensaje(@PathVariable(name="id")Long id) {
		mensajeService.eliminarMensaje(id);
	}
	
}