package com.hypertek.entity;

import com.hypertek.enums.PAYMENTSTATUS;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Payment extends BaseEntity {

    private BigDecimal amount;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    @Enumerated(EnumType.STRING)
    private PAYMENTSTATUS paymentstatus;
    @OneToOne(cascade = CascadeType.PERSIST)
    private PaymentDetail paymentDetail;

    public Payment(BigDecimal amount, LocalDate createdDate, PAYMENTSTATUS paymentstatus) {
        this.amount = amount;
        this.createdDate = createdDate;
        this.paymentstatus = paymentstatus;
    }
}
