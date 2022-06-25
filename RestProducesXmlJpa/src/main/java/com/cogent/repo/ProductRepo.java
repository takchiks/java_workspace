package com.cogent.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	public List<Product> findByCategory(String category);
//	public List<Product> findBetween(double priceMin,double priceMax);

}
