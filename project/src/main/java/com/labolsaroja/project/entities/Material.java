package com.labolsaroja.project.entities;

public class Material {
	private long IdMaterial;
	private String material;
	
	public Material(long idMaterial, String material) {
		super();
		IdMaterial = idMaterial;
		this.material = material;
	}
	
	public Material() {
	}

	public long getIdMaterial() {
		return IdMaterial;
	}

	public void setIdMaterial(long idMaterial) {
		IdMaterial = idMaterial;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Material [IdMaterial=" + IdMaterial + ", material=" + material + "]";
	}
}
