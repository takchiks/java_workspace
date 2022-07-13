package com.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.entity.WishList;

public interface WishListRepo extends JpaRepository<WishList, Integer> {

}
