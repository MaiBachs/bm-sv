package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "credit_cards")
public class CreditCards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CC_number")
    private String ccNumber;

    @Column(name = "Maximum_Limit")
    private Long maximumLimit;

    @Column(name = "Expiry_Date")
    private java.sql.Date expiryDate;

    @Column(name = "Credit_Score")
    private Integer creditScore;

    @Column(name = "CVC")
    private Integer cvc;

    @Column(name = "locked")
    private Boolean locked;

    @Column(name = "get_physical_card")
    private Boolean getPhysicalCard;

    @Column(name = "Customer_id")
    private Integer customerId;
}
