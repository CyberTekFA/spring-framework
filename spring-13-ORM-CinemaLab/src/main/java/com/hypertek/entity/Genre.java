package com.hypertek.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Genre extends BaseEntity{
    private String name;
    @ManyToMany(mappedBy = "genres")
    private List<Movie> movies;
}
