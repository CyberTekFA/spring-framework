package com.hypertek.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class PaymentDetail extends BaseEntity{
    private BigDecimal commissionAmount;
   private BigDecimal merchantPayOutAmount;
   @Column(columnDefinition = "DATE")
    private LocalDate payOutDate;

   @OneToOne(mappedBy = "paymentDetail")
   private Payment payment;
    public PaymentDetail(BigDecimal commissionAmount, BigDecimal merchantPayOutAmount, LocalDate payOutDate) {
        this.commissionAmount = commissionAmount;
        this.merchantPayOutAmount = merchantPayOutAmount;
        this.payOutDate = payOutDate;
    }
}
