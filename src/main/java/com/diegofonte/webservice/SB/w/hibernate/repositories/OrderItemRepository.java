package com.diegofonte.webservice.SB.w.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegofonte.webservice.SB.w.hibernate.entities.OrderItem;
import com.diegofonte.webservice.SB.w.hibernate.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
