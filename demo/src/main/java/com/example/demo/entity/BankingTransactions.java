package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "banking_transactions")
public class BankingTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Transaction_Type")
    private String transactionType;

    @Column(name = "Description")
    private String description;

    @Column(name = "Amount")
    private Long amount;

    @Column(name = "Payee")
    private String payee;

    @Column(name = "recipient_account_number")
    private String recipientAccountNumber;

    @Column(name = "Date")
    private java.sql.Date date;

    @Column(name = "Customer_id")
    private Integer customerId;

    @Column(name = "recipient_accounts_id")
    private Integer recipientAccountsId;

    @Column(name = "other_bank_id")
    private Integer otherBankId;
}
