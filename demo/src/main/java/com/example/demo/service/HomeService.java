package com.example.demo.service;

import com.example.demo.controller.Output.HomeOutput;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.BankingTransactionsRepository;
import com.example.demo.repository.CreditCardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    @Autowired
    private CreditCardsRepository creditCardsRepository;
    @Autowired
    private BankingTransactionsRepository bankingTransactionsRepository;
    @Autowired
    private AccountRepository accountRepository;

    public HomeOutput getHomePage(){
        HomeOutput homeOutput = new HomeOutput();
        homeOutput.setTotalUser(accountRepository.count());
        homeOutput.setTotalCardLocked(creditCardsRepository.totalCardLokced());
        homeOutput.setTotalCard(creditCardsRepository.totalCard());
        return homeOutput;
    }
}
