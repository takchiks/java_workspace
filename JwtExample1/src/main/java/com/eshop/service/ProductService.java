package com.eshop.service;

import java.util.List;

import com.eshop.entity.Product;

public interface ProductService {
	public Product findProductById(int i);
	public List<Product> getAllProduct();

}
