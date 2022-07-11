package com.cogent.eshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.eshop.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
