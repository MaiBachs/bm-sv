package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Account_id")
    private String accountId;

    @Column(name = "Account_Balance")
    private Long accountBalance;

    @Column(name = "Date_Opened")
    private java.sql.Date dateOpened;

    @Column(name = "password")
    private String password;

    @Column(name = "Account_Type")
    private String accountType;

    @Column(name = "PINCode")
    private String pinCode;

    @Column(name = "iNick")
    private String iNick;
}
