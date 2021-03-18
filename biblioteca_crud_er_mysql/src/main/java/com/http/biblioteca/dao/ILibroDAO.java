package com.http.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.biblioteca.dto.Libro;

public interface ILibroDAO extends JpaRepository<Libro, Long> {

}