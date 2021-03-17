package com.http.biblioteca.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Editorial")
public class Editorial {
	
	//Atributos de entidad 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;


    //@OneToMany
    //@JoinColumn(name="id")
    //private List<Video> video;
	
	
	//Constructor
	public Editorial() {
	}

	public Editorial(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	
	//Getter And Setter
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
	
	
	

	@Override
	public String toString() {
		return "Editorial [id=" + id + ", nombre=" + nombre + "]";
	}
	

	

}
