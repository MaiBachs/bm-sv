package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Duration_in_Years")
    private Long durationInYears;

    @Column(name = "Loan_Transaction_Date")
    private java.sql.Date loanTransactionDate;

    @Column(name = "Interest_Rate")
    private Long interestRate;

    @Column(name = "Loan_Amount_Taken")
    private Long loanAmountTaken;

    @Column(name = "Loan_Amount_Repaid")
    private Long loanAmountRepaid;

    @Column(name = "Loan_Type")
    private String loanType;

    @Column(name = "Customer_id")
    private Integer customerId;
}
