package com.diegofonte.webservice.SB.w.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegofonte.webservice.SB.w.hibernate.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
