package com.example.demo.repository;

import com.example.demo.entity.CcTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcTransactionsRepository extends JpaRepository<CcTransactions, Integer> {
}
