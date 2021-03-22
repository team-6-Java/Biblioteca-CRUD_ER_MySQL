package com.http.biblioteca.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;



@Entity
@Table(name="usuario")
public class Usuario {

	//Atributos de entidad 
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contraseña")
	private String contraseña;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "imagen")
	private String imagen;

	
	@OneToMany
    @JoinColumn(name="id")
    private List<Prestamo> prestamo;

	@OneToMany
    @JoinColumn(name="id")
    private List<Mensaje> mensaje;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Libro> libro;
	
	
	
	public Usuario () {
    	
    }
	
	public Usuario(String username, String nombre, String apellido, String email, String contraseña, String descripcion,
			String imagen, List<Prestamo> prestamo, List<Mensaje> mensaje, List<Libro> libro) {
		super();
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contraseña = contraseña;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.prestamo = prestamo;
		this.mensaje = mensaje;
		this.libro = libro;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public void setPrestamo(List<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}

	public void setMensaje(List<Mensaje> mensaje) {
		this.mensaje = mensaje;
	}

	public void setLibro(List<Libro> libro) {
		this.libro = libro;
	}
	

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prestamo")
	public List<Prestamo> getPrestamo() {
		return prestamo;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mensaje")
	public List<Mensaje> getMensaje() {
		return mensaje;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
	public List<Libro> getLibro() {
		return libro;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", contraseña=" + contraseña + ", descripcion=" + descripcion + ", imagen=" + imagen + ", prestamo="
				+ prestamo + ", mensaje=" + mensaje + ", libro=" + libro + "]";
	}

	
	
	
}