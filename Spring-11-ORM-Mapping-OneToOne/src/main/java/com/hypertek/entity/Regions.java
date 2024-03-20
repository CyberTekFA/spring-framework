package com.hypertek.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Data
public class Regions extends BaseEntity{
    private String regions;
    private String country;

    @OneToOne(mappedBy = "regions")
    private Employee employee;
    public Regions(String regions, String country) {
        this.regions = regions;
        this.country = country;
    }
}
