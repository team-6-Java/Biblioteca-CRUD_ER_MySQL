package com.http.biblioteca.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Autor")
public class Autor {
	
	//Atributos de entidad 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "apellido")
		private String apellido;
		
		@OneToMany
	    @JoinColumn(name="id")
	    private List<Libro> libro;
		
		
		
		//Constructor
		public Autor() {
			super();
		}

		
		public Autor(Long id, String nombre, String apellido, List<Libro> libro) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.libro = libro;
		}

		//Getter and Setter
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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


		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "libro")
		public List<Libro> getLibro() {
			return libro;
		}

		public void setLibro(List<Libro> libro) {
			this.libro = libro;
		}

		
		
		
		@Override
		public String toString() {
			return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", libro=" + libro + "]";
		}

	  
		

}