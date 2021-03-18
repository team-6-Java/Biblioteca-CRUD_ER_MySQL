package com.http.biblioteca.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;



@Entity
@Table(name="Libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "isbn")
	private String isbn;
	
	@Column(name = "tematica")
	private String tematica;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "paginas")
	private String paginas;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "veces_prestado")
	private int veces_prestado;
	
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "editorial")
	private Editorial editorial;
	
	@ManyToOne
	@JoinColumn(name = "autor")
	private Autor autor;

	
	@OneToMany
    @JoinColumn(name="id")
    private List<Prestamo> prestamo;
	
	
	
	public Libro () {
    	
    }

	

	public Libro(Long id, String titulo, String isbn, String tematica, String estado, String imagen, String paginas,
			String descripcion, int veces_prestado, Usuario usuario, 
			Editorial editorial, Autor autor,
			List<Prestamo> prestamo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.tematica = tematica;
		this.estado = estado;
		this.imagen = imagen;
		this.paginas = paginas;
		this.descripcion = descripcion;
		this.veces_prestado = veces_prestado;
		this.usuario = usuario;
		this.editorial = editorial;
		this.autor = autor;
		this.prestamo = prestamo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getVeces_prestado() {
		return veces_prestado;
	}

	public void setVeces_prestado(int veces_prestado) {
		this.veces_prestado = veces_prestado;
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Editorial getEditorial() {
		return editorial;
	}


	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prestamo")
	public List<Prestamo> getPrestamo() {
		return prestamo;
	}

	
	
	public void setPrestamo(List<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", tematica=" + tematica + ", estado="
				+ estado + ", imagen=" + imagen + ", paginas=" + paginas + ", descripcion=" + descripcion
				+ ", veces_prestado=" + veces_prestado + ", usuario=" + usuario + ", editorial=" + editorial
				+ ", autor=" + autor + ", prestamo=" + prestamo + "]";
	}



	


	


	



	

	
	
}