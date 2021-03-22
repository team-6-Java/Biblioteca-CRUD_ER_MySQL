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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Editorial")
public class Editorial {
	
	//Atributos de entidad 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;


	@OneToMany
    @JoinColumn(name="id")
	@Cascade(CascadeType.SAVE_UPDATE)
    private List<Libro> libro;
	
	
	//Constructor
	public Editorial() {
	}

	
	public Editorial(Long id, String nombre, List<Libro> libro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.libro = libro;
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
		return "Editorial [id=" + id + ", nombre=" + nombre + ", libro=" + libro + "]";
	}


	
	

	

}