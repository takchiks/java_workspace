package com.cogent.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.eshop.entity.Product;
import com.cogent.eshop.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product findProductById(int i) {
		// TODO Auto-generated method stub
		return productRepo.findById(i).get();
	}
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}
