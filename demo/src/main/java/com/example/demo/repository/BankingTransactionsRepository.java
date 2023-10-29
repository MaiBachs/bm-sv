package com.example.demo.repository;

import com.example.demo.entity.BankingTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankingTransactionsRepository extends JpaRepository<BankingTransactions, Integer> {
    @Query("SELECT bt FROM BankingTransactions bt WHERE bt.recipientAccountsId IS NOT NULL")
    List<BankingTransactions> internalTransaction();
    @Query("SELECT bt FROM BankingTransactions bt WHERE bt.recipientAccountsId IS NULL")
    List<BankingTransactions> externalTransaction();
}
