package com.eshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.entity.Product;
import com.eshop.entity.WishList;
import com.eshop.service.ProductService;
import com.eshop.service.WishListService;

@RestController
@CrossOrigin
public class WishListController {
	@Autowired
	private WishListService wishListService;
	
	@Autowired
	private ProductService productService;


	@GetMapping("/addToWishlist/{pid}")
	public WishList addToWishList(@PathVariable("pid") int pid) {
		System.out.println("Inside get Product");
		
		return wishListService.addProduct(pid) ;
		
	}
	
	@GetMapping("/wishlist")
	public List<Product> getWishlist (){
		List<WishList> list = wishListService.getAllWishList();
		List<Integer> wishlist= new ArrayList<Integer>();
		
		List<Product> wishListProducts = new ArrayList<Product>();

		for(WishList i: list) {
			wishlist.add(i.getPid());
			wishListProducts.add(productService.findProductById(i.getPid()));
		}
		
		return wishListProducts;
		
	}
}
