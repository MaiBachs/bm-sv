package com.example.demo.service;

import com.example.demo.entity.Accounts;
import com.example.demo.repository.AccountRepository;
import com.example.demo.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountsService{
    @Autowired
    private AccountRepository accountRepository;

    public Accounts register(String userName, String password){
        Accounts accounts = new Accounts();
        accounts.setAccountId(String.valueOf(new Date().getTime()));
        accounts.setUserName(userName);
        accounts.setPassword(password);
        accounts.setAccountType(Constant.ACCOUNT_TYPE_ADMIN);
        accounts.setAccountBalance(0l);
        accounts.setDateOpened(new Date());
        accounts.setPinCode("0000");
        return accountRepository.save(accounts);
    }

    public Accounts login(String userName, String password){
        return accountRepository.findByUserNameAndPasswordAndAccountType(userName, password, Constant.ACCOUNT_TYPE_ADMIN);
    }
}
