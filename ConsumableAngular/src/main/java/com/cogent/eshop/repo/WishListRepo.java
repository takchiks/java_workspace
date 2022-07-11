package com.cogent.eshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.eshop.entity.WishList;

public interface WishListRepo extends JpaRepository<WishList, Integer> {

}
