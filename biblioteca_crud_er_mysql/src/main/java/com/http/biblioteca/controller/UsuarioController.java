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

import com.http.biblioteca.dto.Usuario;
import com.http.biblioteca.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioService UsuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> listarUsuario(){
		return UsuarioService.listarUsuario();
	}
	
	@PostMapping("/usuarios")
	public Usuario salvarUsuario(@RequestBody Usuario Usuario) {
		
		return UsuarioService.guardarUsuario(Usuario);
	}
	
	@GetMapping("/usuarios/{username}")
	public Usuario UsuarioUsername(@PathVariable(name="username") String username) {
		
		Usuario Usuario_xusername= new Usuario();
		
		Usuario_xusername=UsuarioService.UsuarioUsername(username);
		
		//System.out.println("Usuario Username: "+Usuario_xusername);
		
		return Usuario_xusername;
	}
	
	@PutMapping("/usuarios/{username}")
	public Usuario actualizarUsuario(@PathVariable(name="username")String username,@RequestBody Usuario Usuario) {
		
		Usuario Usuario_seleccionado= new Usuario();
		Usuario Usuario_actualizado= new Usuario();
		
		Usuario_seleccionado= UsuarioService.UsuarioUsername(username);
		
		
		Usuario_seleccionado.setNombre(Usuario.getNombre());
		Usuario_seleccionado.setApellido(Usuario.getApellido());
		Usuario_seleccionado.setEmail(Usuario.getEmail());
		Usuario_seleccionado.setDescripcion(Usuario.getDescripcion());
		Usuario_seleccionado.setImagen(Usuario.getImagen());
		

		
		Usuario_actualizado = UsuarioService.actualizarUsuario(Usuario_seleccionado);
		
		//System.out.println("El Usuario actualizado es: "+ Usuario_actualizado);
		
		return Usuario_actualizado;
	}
	
	@DeleteMapping("/usuarios/{username}")
	public void eliminarUsuario(@PathVariable(name="username")String username) {
		UsuarioService.eliminarUsuario(username);
	}
	
}