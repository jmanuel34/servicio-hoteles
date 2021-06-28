package com.cursoee.hoteles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cursoee.hoteles.model.Hotel;
import com.cursoee.hoteles.service.HotelesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Servicio de hoteles")
@RestController
public class Controller {
	@Autowired
	HotelesService service;
		
		@ApiOperation("Devuelve un hotel a partir de su nombre")
		@GetMapping(value="hotel/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
		public Hotel hotel (@PathVariable("nombre") String nombre) {
			return service.getHotel(nombre);
		}
		
		@ApiOperation("Devuelve el listado de todos los hoteles")
		@GetMapping(value="hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Hotel> hoteles() {
			return service.hoteles();
		}
}
