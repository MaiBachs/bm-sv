package com.example.demo.controller.Input;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

@Data
public class CreditcardsInput {
    private Integer page;
    private Integer pageSize;
    private Boolean locked;
}
