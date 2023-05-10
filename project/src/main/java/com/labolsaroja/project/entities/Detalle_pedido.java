package com.labolsaroja.project.entities;

public class Detalle_pedido {
	private long id;
	private int cantidad;
	
	public Detalle_pedido(long id, int cantidad) {
		super();
		this.id = id;
		this.cantidad = cantidad;
	}
	
	public Detalle_pedido() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Detalle_pedido [id=" + id + ", cantidad=" + cantidad + "]";
	}
}


