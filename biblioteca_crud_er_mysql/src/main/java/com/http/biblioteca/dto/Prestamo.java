package com.http.biblioteca.dto;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name="Prestamo")
public class Prestamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valoracion_libro")
	private String valoracion_libro;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_prestamo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_devolucion;
	
	@ManyToOne
	@JoinColumn(name = "Usuario")
	private Usuario usuario;
	
	

	@ManyToOne
	@JoinColumn(name = "Libro")
	private Libro libro;
	

	public Prestamo () {
    	
    }


	public Prestamo(Long id, String valoracion_libro, Date fecha_prestamo, Date fecha_devolucion, Usuario usuario
			,Libro libro
			) {
		super();
		this.id = id;
		this.valoracion_libro = valoracion_libro;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_devolucion = fecha_devolucion;
		this.usuario = usuario;
		this.libro = libro;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getValoracion_libro() {
		return valoracion_libro;
	}


	public void setValoracion_libro(String valoracion_libro) {
		this.valoracion_libro = valoracion_libro;
	}


	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}


	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}


	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}


	public void setFecha_devolucion(Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	

	

	


	
	
	
}