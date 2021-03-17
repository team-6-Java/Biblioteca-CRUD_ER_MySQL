package com.http.biblioteca.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
		
		  //@OneToMany
	    //@JoinColumn(name="id")
	    //private List<Video> video;
		
		
		
		//Constructor
		public Autor() {
			super();
		}

		public Autor(Long id, String nombre, String apellido) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
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

		
		
		
		@Override
		public String toString() {
			return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
		}

		
	  
		

}
