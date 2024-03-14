package com.hypertek.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
@Entity
public class CheckingAccount extends Account{

    private BigDecimal overDraftFee;

}
