package com.example.demo.controller;

import com.example.demo.controller.Input.CreditcardsInput;
import com.example.demo.controller.Output.CreditcardsOutput;
import com.example.demo.service.IService.ICreditCardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CreditCardsController {
    @Autowired
    private ICreditCardsService iCreditCardsService;

    @PostMapping(value = "/get-credit-card-page")
    public CreditcardsOutput getCard(@RequestBody CreditcardsInput input){
        CreditcardsOutput output = iCreditCardsService.getCreditCardByPage(input.getPage(), input.getPageSize(), input.getLocked());
        return  output;
    }
}
