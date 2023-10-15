package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Full_Name")
    private String fullName;

    @Column(name = "Date_of_Birth")
    private String dateOfBirth;

    @Column(name = "Country")
    private String country;

    @Column(name = "Email")
    private String email;

    @Column(name = "CMND")
    private String cmnd;

    @Column(name = "Sex")
    private Character sex;

    @Transient
    private List<Loan> loans;
}
