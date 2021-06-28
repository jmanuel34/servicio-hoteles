package com.cursoee.hoteles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoee.hoteles.dao.HotelesRepository;
import com.cursoee.hoteles.model.Hotel;

@Service
public class HotelesServiceImpl implements HotelesService {
	@Autowired
	HotelesRepository repository;

	@Override
	public Hotel getHotel(String nombre) {
		return repository.findByNombre(nombre);
		}

	@Override
	public List<Hotel> hoteles() {
		return repository.findAll();
	}

}
