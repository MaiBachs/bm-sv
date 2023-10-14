package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account_customers")
public class AccountCustomers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Account_id")
    private Integer accountId;

    @Column(name = "Customer_id")
    private Integer customerId;
}
