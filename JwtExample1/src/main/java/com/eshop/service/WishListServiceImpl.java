package com.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.entity.WishList;
import com.eshop.repository.WishListRepo;

@Service
public class WishListServiceImpl implements WishListService {
	
	@Autowired
	private WishListRepo wishListRepo; 

	@Override
	public WishList findWishListById(int i) {
		// TODO Auto-generated method stub
		return wishListRepo.findById(i).get();
	}

	@Override
	public List<WishList> getAllWishList() {
		// TODO Auto-generated method stub
		return wishListRepo.findAll();
	}

	@Override
	public void deleteById(int i) {
		// TODO Auto-generated method stub
		wishListRepo.deleteById(i);
	}

	@Override
	public WishList addProduct(int i) {
		// TODO Auto-generated method stub
		WishList wishList = new WishList(i);
		System.out.println("Inside get Product");
		System.out.println(wishList.getPid());
		return wishListRepo.save(wishList);
	}
	

}
