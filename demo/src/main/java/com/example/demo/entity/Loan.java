package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Duration_in_Years")
    private Date durationInYears;

    @Column(name = "Loan_Transaction_Date")
    private Date loanTransactionDate;

    @Column(name = "Loan_Amount_Taken")
    private Long loanAmountTaken;

    @Column(name = "Loan_Amount_Repaid")
    private Long loanAmountRepaid;

    @Column(name = "Repaid")
    private Long repaid;

    @Column(name = "Customer_id")
    private Integer customerId;

    @Column(name = "interest_id")
    private Integer interestId;
}
