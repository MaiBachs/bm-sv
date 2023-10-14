package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cc_transactions")
public class CcTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CC_number")
    private String ccNumber;

    @Column(name = "Transaction_Date")
    private java.sql.Date transactionDate;

    @Column(name = "Amount")
    private Long amount;

    @Column(name = "Merchant_Details")
    private String merchantDetails;

    @Column(name = "recipient_accounts_id")
    private Integer recipientAccountsId;
}
