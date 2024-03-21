package com.hypertek.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Item extends BaseEntity {
    private String name ;
    private String code;
    @ManyToMany(mappedBy = "item")
    private List<Cart> cart;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
