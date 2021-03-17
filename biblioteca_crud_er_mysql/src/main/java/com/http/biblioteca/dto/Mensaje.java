package com.http.biblioteca.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mensaje")
public class Mensaje {
	
	//Atributos de entidad 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "usuario1")
		private String usuario1;
		@Column(name = "usuario2")
		private String usuario2;
		
		
	    //@OneToMany
	    //@JoinColumn(name="id")
	    //private List<Video> video;
		
		
	//Constructor
		public Mensaje() {
			super();
		}

		public Mensaje(Long id, String usuario1, String usuario2) {
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


		public String getUsuario1() {
			return usuario1;
		}


		public void setUsuario1(String usuario1) {
			this.usuario1 = usuario1;
		}


		public String getUsuario2() {
			return usuario2;
		}


		public void setUsuario2(String usuario2) {
			this.usuario2 = usuario2;
		}


		@Override
		public String toString() {
			return "Mensaje [id=" + id + ", usuario1=" + usuario1 + ", usuario2=" + usuario2 + "]";
		}
		
		
		
		

}
