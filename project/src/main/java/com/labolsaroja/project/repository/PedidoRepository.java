package com.labolsaroja.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labolsaroja.project.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
