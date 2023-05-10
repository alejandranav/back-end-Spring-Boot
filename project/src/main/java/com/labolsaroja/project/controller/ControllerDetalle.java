package com.labolsaroja.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (path="/api/detalle/")
public class ControllerDetalle {

	private final DetalleService detalleService;
	@Autowired
	public ControllerDetalle(DetalleService detalleService) {
		this.detalleService = detalleService;
	}

	
 @PostMapping 
public Detalle addDetalle(@RequestBody Detalle detalle) {
	return detalleService.addDetalle(detalle);
			
 }//addDetalle
 
 @GetMapping (path="{detId}")
	public Detalle getDetalle(@PathVariable ("detId") Long id) {
		return detalleService.getDetalle(id);
	}//getDetalle
	
	@DeleteMapping (path="{detId}")
	public Detalle deleteDetalle(@PathVariable ("detId") Long id) {
		return detalleService.deleteDetalle(id);
	}//deleteDetalle

	@PutMapping (path="{detId}")
	public Detalle updateDetalle(@PathVariable ("detId") Long id,
			@RequestParam (required=false) int cantidad)
			 {
			
		return detalleService.updateDetalle(id, cantidad);
	}//updateDetalle
}
