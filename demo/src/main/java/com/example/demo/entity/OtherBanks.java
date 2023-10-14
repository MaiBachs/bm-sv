package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Data
@Entity
@Table(name = "other_banks")
public class OtherBanks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "other_banks_name")
    private String otherBanksName;

    @Column(name = "other_banks_longName")
    private String otherBanksLongName;

    @Column(name = "other_banks_icons")
    private Blob otherBanksIcons;

    @Column(name = "BINCode")
    private String binCode;
}
