package com.cogent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Integer> {

}
