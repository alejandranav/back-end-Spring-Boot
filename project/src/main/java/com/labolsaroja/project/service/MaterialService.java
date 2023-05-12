package com.labolsaroja.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labolsaroja.project.model.Material;
import com.labolsaroja.project.repository.MaterialRepository;
@Service
public class MaterialService {
	private final MaterialRepository materialRepository;
	@Autowired
	public MaterialService(MaterialRepository materialRepository) {
		this.materialRepository=materialRepository;
	}
	public Material addMaterial(Material material) {
		// TODO Auto-generated method stub
		return null;
	}

	public Material getMaterial(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Material deleteMaterial(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Material updateMaterial(Long idMaterial, String material) {
		// TODO Auto-generated method stub
		return null;
	}

}
