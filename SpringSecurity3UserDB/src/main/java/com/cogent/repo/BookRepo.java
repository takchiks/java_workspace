package com.cogent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
