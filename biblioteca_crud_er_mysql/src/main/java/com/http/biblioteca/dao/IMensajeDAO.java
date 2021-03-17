package com.http.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.biblioteca.dto.Mensaje;

public interface IMensajeDAO  extends JpaRepository<Mensaje, Long>{

}
