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
@RequestMapping (path="/api/usuario/")

public class ControllerUsuario {

	private final UsuarioService usuarioService;
	@Autowired
	public ControllerUsuario(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
 @PostMapping 
public Usuario addUsuario(@RequestBody Usuario usuario) {
	return usuarioService.addUsuario(usuario);
			
 }//addUsuario
 
 @GetMapping (path="{usrId}")
	public Usuario getUsuario(@PathVariable ("usrId") Long id) {
		return usuarioService.getUsuario(id);
	}//getUsuario
	
	@DeleteMapping (path="{usrId}")
	public Usuario deleteCategoria(@PathVariable ("usrId") Long id) {
		return usuarioService.deleteUsuario(id);
	}//deleteUsuario

	@PutMapping (path="{usrId}")
	public Usuario updateUsuario(@PathVariable ("usrId") Long idUsuarios,
			@RequestParam (required=false)String nombre,
			@RequestParam (required=false)String email,
			@RequestParam (required=false)int telefono,
			@RequestParam (required=false)String contrasena
			)
			 {
			
		return usuarioService.updateUsuario(idUsuarios, nombre,email, telefono,contrasena);
	}//updateUsuario
}
