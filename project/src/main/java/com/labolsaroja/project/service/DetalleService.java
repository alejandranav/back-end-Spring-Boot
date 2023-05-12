package com.labolsaroja.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labolsaroja.project.model.Detalle_pedido;

import com.labolsaroja.project.repository.Detalle_PedidoRepository;
@Service

public class DetalleService {
	private final Detalle_PedidoRepository detalleRepository;
	@Autowired
	public DetalleService(Detalle_PedidoRepository detalleRepository) {
		this.detalleRepository=detalleRepository;
	}
	public Detalle_pedido addDetalle(Detalle_pedido detalle) {
		// TODO Auto-generated method stub
		return null;
	}

	public Detalle_pedido getDetalle(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Detalle_pedido deleteDetalle(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Detalle_pedido updateDetalle(Long id, int cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
