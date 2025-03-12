package com.diegofonte.webservice.SB.w.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegofonte.webservice.SB.w.hibernate.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
