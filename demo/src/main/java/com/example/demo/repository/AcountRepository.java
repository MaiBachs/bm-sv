package com.example.demo.repository;

import com.example.demo.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcountRepository extends JpaRepository<Accounts, Integer> {
}
