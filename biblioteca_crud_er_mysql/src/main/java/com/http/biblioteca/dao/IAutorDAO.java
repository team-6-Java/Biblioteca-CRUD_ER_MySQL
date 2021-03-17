package com.http.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.biblioteca.dto.Autor;

public interface IAutorDAO extends JpaRepository<Autor, Long> {

}
