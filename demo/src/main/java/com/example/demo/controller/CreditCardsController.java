package com.example.demo.controller;

import com.example.demo.controller.Input.CreditcardsInput;
import com.example.demo.controller.Output.CreditcardsOutput;
import com.example.demo.entity.CreditCards;
import com.example.demo.service.CreditCardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/credit-card")
public class CreditCardsController {
    @Autowired
    private CreditCardsService creditCardsService;

    @PostMapping(value = "/get-card-by-page")
    public CreditcardsOutput getCard(@RequestBody CreditcardsInput input){
        return creditCardsService.getCreditCardByPage(input.getPage(), input.getPageSize(), input.getLocked());
    }

    @GetMapping(value = "/lock-card")
    public CreditCards lockCard(@RequestParam("id") int id){
        return creditCardsService.lockCard(id);
    }

    @GetMapping(value = "/unlock-card")
    public CreditCards unLockCard(@RequestParam("id") int id){
        return creditCardsService.unLockCard(id);
    }
}
