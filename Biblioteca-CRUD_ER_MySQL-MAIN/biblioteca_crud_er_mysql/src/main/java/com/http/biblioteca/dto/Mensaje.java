package com.http.biblioteca.dto;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mensajes")
public class Mensaje {

	// Atributos de entidad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "mensaje")
	private String mensaje;
	
	@ManyToOne
	@JoinColumn(name = "usuario1")
	private Usuario usuario1;

	@ManyToOne
	@JoinColumn(name = "usuario2")
	private Usuario usuario2;


	// Constructor
	public Mensaje() {
	}

	public Mensaje(Long id, String mensaje, Usuario usuario1, Usuario usuario2) {
		this.id = id;
		this.mensaje = mensaje;
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
	}



	// Getter and Setter

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public Usuario getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", usuario1=" + usuario1 + ", usuario2=" + usuario2 + ", mensaje=" + mensaje + "]";
	}
	

}