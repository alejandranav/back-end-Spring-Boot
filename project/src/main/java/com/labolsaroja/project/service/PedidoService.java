package com.labolsaroja.project.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labolsaroja.project.model.Pedido;
import com.labolsaroja.project.repository.PedidoRepository;
@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;
	@Autowired
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository=pedidoRepository;
	}

	public Pedido addPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pedido getPedido(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pedido deletePedido(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pedido updatePedido(Long idPedido, Date fecha, float total) {
		// TODO Auto-generated method stub
		return null;
	}

}
