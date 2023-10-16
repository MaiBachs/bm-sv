package com.example.demo.controller;

import com.example.demo.controller.Input.AccountInput;
import com.example.demo.entity.Accounts;
import com.example.demo.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private AccountsService accountsService;

    @PostMapping(path = "/register")
    public Accounts register(@RequestBody AccountInput input){
        return accountsService.register(input.getUserName(), input.getPassword());
    }

    @PostMapping(path = "/login")
    public Accounts login(@RequestBody AccountInput input){
        return accountsService.login(input.getUserName(), input.getPassword());
    }
}
