package com.hypertek.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Merchant extends BaseEntity{

    private String name;
    private String merchantCode;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer payOutDelayCount;
    @OneToMany(mappedBy = "merchant")
    private List<Payment> payment;


    public Merchant(String name, String merchantCode, BigDecimal transactionFee, BigDecimal commissionRate, Integer payOutDelayCount) {
        this.name = name;
        this.merchantCode = merchantCode;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payOutDelayCount = payOutDelayCount;
    }
}
