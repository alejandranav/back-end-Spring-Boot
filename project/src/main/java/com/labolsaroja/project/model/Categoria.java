package com.labolsaroja.project.model;

public class Categoria {
	private long id;
	private String tipo;
	public Categoria(long id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
	
	public Categoria() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", tipo=" + tipo + "]";
	}
}
