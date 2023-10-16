package com.example.demo.controller;

import com.example.demo.entity.Customers;
import com.example.demo.entity.Interest;
import com.example.demo.entity.Loan;
import com.example.demo.service.CustomersService;
import com.example.demo.service.InterestService;
import com.example.demo.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan")
@CrossOrigin(origins = "*")
public class LoanController {
    @Autowired
    private LoanService loanService;
    @Autowired
    private InterestService interestService;
    @Autowired
    private CustomersService customersService;

    @PostMapping(path = "/set-interest")
    public Interest setInterest(@RequestBody Interest interest){
        return interestService.save(interest);
    }

    @DeleteMapping(path = "/delete-interest")
    public void deleteInterest(@RequestBody Interest interest){
        interestService.deleteInterest(interest);
    }

    @GetMapping(path = "/find-by-cmnd")
    public Customers findByCmnd(@RequestParam("cmnd") String cmnd){
        return customersService.findByCmnd(cmnd);
    }

    @GetMapping(path = "/find-all-interest")
    public List<Interest> findAllInterest(){
        return interestService.findAll();
    }

    @PostMapping(path = "/customer-loan")
    public Loan customerLoan(@RequestBody Loan loan){
        return loanService.customerLoan(loan);
    }

    @PostMapping(path = "/customer-repaid")
    public Loan customerPayment(@RequestBody Loan loan){
        return loanService.customerPayment(loan);
    }
}
