package com.example.demo.controller.Output;

import com.example.demo.entity.CreditCards;
import lombok.Data;

import java.util.List;

@Data
public class CreditcardsOutput {
    private int page;
    private int totalPage;
    private List<CreditCards> creditCards;
}
