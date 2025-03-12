package com.diegofonte.webservice.SB.w.hibernate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegofonte.webservice.SB.w.hibernate.entities.Product;
import com.diegofonte.webservice.SB.w.hibernate.repositories.ProductRepository;

@Service 
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
