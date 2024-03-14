package com.hypertek.entity;

import com.hypertek.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    @Column(columnDefinition = "DATE")
    private LocalDate birthDay;
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
