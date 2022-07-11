package com.cogent.eshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.eshop.entity.Product;
import com.cogent.eshop.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

//	static List<Product> list = new ArrayList<Product>();
//	static List<Integer> wishlist = new ArrayList<Integer>();
//	static {
//		// TODO Auto-generated constructor stub
//	
//	list.add(new Product(1,"AC", "Model X","",123,32, "url","","ac.jpg",""));
//	list.add(new Product(2,"Iphone", "Model X","",123,32, "url","","iphone.jpg",""));
//	list.add(new Product(3,"Jeans", "Model X","",123,32, "url","","jeans.jpg",""));
//	list.add(new Product(4,"LED", "Model X","",123,32, "url","","LED.jpg",""));
//	list.add(new Product(5,"Tshirt", "Model X","",123,32, "url","","tshirt.jpg",""));
//	list.add(new Product(6,"LED", "Model X","",123,32, "url","","LED.jpg",""));
//	
//	}
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		
		return productService.findProductById(id);
		
	}

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		System.out.println("Inside get Product");
		
		return productService.getAllProduct();
		
	}
	
}
