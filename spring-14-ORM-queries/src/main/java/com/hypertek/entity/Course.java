package com.hypertek.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
public class Course extends BaseEntity{
    private String name;
    private String category;
    private String rating;
    private String description;

}
