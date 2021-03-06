package com.cogent.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.exception.ProductNotFoundException;
import com.cogent.model.Product;
import com.cogent.repo.ProductRepo;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
	@Autowired
	private ProductRepo productRepo;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProduct(){
		return new ResponseEntity<List<Product>>(productRepo.findAll(),HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity addProduct(@RequestBody Product product) {
		productRepo.save(product);
		return new ResponseEntity ("Successfully added!",HttpStatus.OK);
	}
	@GetMapping(path = "{pid}")
	public ResponseEntity<Product> getById(@PathVariable(name = "pid") int pid) throws ProductNotFoundException{
		return new ResponseEntity<Product>(productRepo.findById(pid).orElseThrow(()->new ProductNotFoundException()),HttpStatus.OK);
	}
	@GetMapping(params = "category")
	public ResponseEntity<List<Product>> getByCategory(@RequestParam(name = "category",required = false) String cat){
		return new ResponseEntity<List<Product>>(productRepo.findByCategory(cat),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity updateProduct(@RequestBody Product product) {
		productRepo.save(product);
		return new ResponseEntity ("Successfully Updated!",HttpStatus.OK);
	}
	@DeleteMapping(path = "{pid}")
	public ResponseEntity deleteProduct(@PathVariable(name = "pid") int pid) {
		productRepo.deleteById(pid);
		return new ResponseEntity ("Successfully Deleted!",HttpStatus.OK);
	}
	
	@GetMapping(params = {"minPrice","maxPrice"})
	public ResponseEntity<List<Product>> getBetweenProduct(@RequestParam(name = "minPrice",defaultValue = "0" ,required = false) double minp,@RequestParam(name= "maxPrice",defaultValue = "100000",required = false) double maxp ){
		List<Product> products = productRepo.findAll();
		Product[] prod = products.toArray(new Product[products.size()]);
		List<Product> returnProducts = new ArrayList<Product>();

		for(Product p:prod) {
			double price = p.getPrice();
			if(minp<maxp && (price> minp && price<maxp )) {
				returnProducts.add(p);
			}
			
		} 
		return new ResponseEntity<List<Product>>(returnProducts,HttpStatus.OK);
	}
	

}
