package com.example.demo.repository;

import com.example.demo.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {
    Accounts findByUserNameAndPasswordAndAccountType(String userName, String password, String accountType);
}
