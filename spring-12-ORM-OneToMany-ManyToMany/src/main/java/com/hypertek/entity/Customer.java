package com.hypertek.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Customer extends BaseEntity{

    private String address;
    private String email;
    private String name;
    private String lastname;
    private String username;


    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> payment;

    public Customer(String address, String email, String name, String lastname, String username) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
    }
}
