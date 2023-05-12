package com.labolsaroja.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labolsaroja.project.model.Categoria;
import com.labolsaroja.project.repository.CategoriaRepository;
@Service
public class CategoriaService {
	private final CategoriaRepository categoriaRepository;
	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository=categoriaRepository;
	}
	public Categoria addCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	public Categoria getCategoria(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Categoria deleteCategoria(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Categoria updateCategoria(Long id, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
