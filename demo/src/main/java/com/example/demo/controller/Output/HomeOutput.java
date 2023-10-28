package com.example.demo.controller.Output;

import lombok.Data;

@Data
public class HomeOutput {
    private Long totalInternalTransaction;
    private Long totalExternalTransaction;
    private Long totalUser;
    private Long totalCard;
    private Long totalCardLocked;
}
