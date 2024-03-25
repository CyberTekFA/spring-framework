package com.hypertek.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Cinema extends BaseEntity{

    private String name;
    private String sponsoredName;
    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;
}
