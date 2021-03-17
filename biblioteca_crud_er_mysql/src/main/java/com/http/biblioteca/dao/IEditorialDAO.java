package com.http.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.biblioteca.dto.Editorial;

public interface IEditorialDAO extends JpaRepository<Editorial, Long> {

}
