package com.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eshop.entity.Product;


public interface ProductRepo extends JpaRepository<Product, Integer> {

}
