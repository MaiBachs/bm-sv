package com.example.demo.service.IService;

import com.example.demo.controller.Output.CreditcardsOutput;

public interface ICreditCardsService {
    CreditcardsOutput getCreditCardByPage(int page, int size, Boolean locked);
}
