package com.cogent.eshop.service;

import java.util.List;

import com.cogent.eshop.entity.Product;
import com.cogent.eshop.entity.WishList;

public interface WishListService {
	public WishList findWishListById(int i);
	public List<WishList> getAllWishList();
	public void deleteById(int i);
	public WishList addProduct(int i);


}
