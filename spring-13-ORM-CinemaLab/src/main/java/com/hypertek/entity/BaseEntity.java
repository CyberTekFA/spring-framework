package com.hypertek.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.java.Log;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
