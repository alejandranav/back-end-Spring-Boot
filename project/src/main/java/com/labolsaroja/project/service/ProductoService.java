package com.labolsaroja.project.service;


import java.util.List;

import org.generation.ecommerce.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labolsaroja.project.model.Producto;
import com.labolsaroja.project.repository.ProductoRepository;

@Service
public class ProductoService {
	private final ProductoRepository productoRepository;
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository=productoRepository;
	}

	public Producto getProducto(Long id) {
		return productoRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("Usuario con id"
	+id+" no existe.")
);
	}

	public Producto deleteProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto updateProducto(Long id, String nombre, int largo, int ancho, int fuelle, String descripcion,
			double precio, String img) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto addProducto(Producto producto) {
		Producto tmp=null;
		if(productoRepository.findById(producto.getId()).isEmpty()) {
			tmp=productoRepository.save(producto);
					}//if
		return tmp;
	}

	public List<Producto> getAllProductos() {
		return productoRepository.findAll();
	}



}
