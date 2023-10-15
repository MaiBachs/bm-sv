package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "interest")
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Type")
    private Integer type;

    @Column(name = "Term")
    private Integer term;

    @Column(name = "percent")
    private Float percent;
}
