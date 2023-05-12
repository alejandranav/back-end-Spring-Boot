package com.labolsaroja.project.model;

import java.util.Date;

public class Pedido {
	private long idPedido;
	private Date fecha;
	private float total;
	
	public Pedido(int idPedido, Date fecha, float total) {
		super();
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.total = total;
	}

	

	public long getIdPedido() {
		return idPedido;
	}



	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", total=" + total + "]";
	}	

}
