package com.http.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.biblioteca.dto.Prestamo;

public interface IPrestamoDAO extends JpaRepository<Prestamo, Long> {

}