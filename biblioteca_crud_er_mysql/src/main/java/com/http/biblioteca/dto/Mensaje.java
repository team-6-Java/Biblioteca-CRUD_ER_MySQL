package com.http.biblioteca.dto;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mensaje")
public class Mensaje {
	
	//Atributos de entidad 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@ManyToOne
		@JoinColumn(name = "Usuario1")
		private Usuario usuario1;
		
		@ManyToOne
		@JoinColumn(name = "Usuario2")
		private Usuario usuario2;
		
		
	//Constructor
		public Mensaje() {
			super();
		}

		public Mensaje(Long id, Usuario usuario1, Usuario usuario2) {
			super();
			this.id = id;
			this.usuario1 = usuario1;
			this.usuario2 = usuario2;
		}
		
		//Getter and Setter

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

		@Override
		public String toString() {
			return "Mensaje [id=" + id + ", usuario1=" + usuario1 + ", usuario2=" + usuario2 + "]";
		}
		
		
		
	
	
		
		
		

}