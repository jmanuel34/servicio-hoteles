package com.cursoee.hoteles.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoee.hoteles.model.Hotel;

public interface HotelesRepository extends JpaRepository<Hotel, Integer> {
	Hotel findByNombre(String nombre);
}
