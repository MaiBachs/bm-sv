package com.example.demo.service;

import com.example.demo.entity.Customers;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private LoanRepository loanRepository;

    public Customers findByCmnd(String cmnd){
        Customers customers = customerRepository.findByCmnd(cmnd);
        if(customers != null){
            customers.setLoans(loanRepository.findByCustomerId(customers.getId()));
        }
        return customers;
    }
}
