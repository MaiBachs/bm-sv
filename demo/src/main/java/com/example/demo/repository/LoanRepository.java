package com.example.demo.repository;

import com.example.demo.entity.Customers;
import com.example.demo.entity.Loan;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByCustomerIdAndStatus(Integer customerId, Integer status);
}
