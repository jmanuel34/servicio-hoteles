package com.cursoee.hoteles.service;

import java.util.List;

import com.cursoee.hoteles.model.Hotel;

public interface HotelesService {
	List<Hotel> hoteles();
	Hotel getHotel(String nombre);
}
