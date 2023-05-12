package com.labolsaroja.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.labolsaroja.project.entities.Detalle_pedido;

@Repository
public interface Detalle_PedidoRepository extends JpaRepository<Detalle_pedido, Long>{

}
