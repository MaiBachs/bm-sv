package com.example.demo.repository;

import com.example.demo.entity.BankingTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingTransactionsRepository extends JpaRepository<BankingTransactions, Integer> {
}
