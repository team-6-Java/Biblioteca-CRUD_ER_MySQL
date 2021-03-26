package com.http.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.biblioteca.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, String> {

}