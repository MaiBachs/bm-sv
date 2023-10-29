package com.example.demo.service;

import com.example.demo.controller.Output.HomeOutput;
import com.example.demo.entity.BankingTransactions;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.BankingTransactionsRepository;
import com.example.demo.repository.CreditCardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<BankingTransactions> internalTransaction = bankingTransactionsRepository.internalTransaction();
        Long moneyInternal = internalTransaction.stream().mapToLong(BankingTransactions::getAmount).sum();
        List<BankingTransactions> externalTransaction = bankingTransactionsRepository.externalTransaction();
        Long moneyExternal = externalTransaction.stream().mapToLong(BankingTransactions::getAmount).sum();
        homeOutput.setMoneyInternalTransaction(moneyInternal);
        homeOutput.setMoneyExternalTransaction(moneyExternal);
        homeOutput.setTotalExternalTransaction((long)externalTransaction.size());
        homeOutput.setTotalInternalTransaction((long)internalTransaction.size());
        homeOutput.setTotalUser(accountRepository.count());
        homeOutput.setTotalCardLocked(creditCardsRepository.totalCardLokced());
        homeOutput.setTotalCard(creditCardsRepository.totalCard());
        return homeOutput;
    }
}
