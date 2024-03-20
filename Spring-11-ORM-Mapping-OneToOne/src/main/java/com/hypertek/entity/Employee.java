package com.hypertek.entity;

import com.hypertek.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Table(name = "Employees")
@Data
public class Employee extends BaseEntity {
    private String firstname;
    private String lastname;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private BigDecimal salary;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "department_id")
    private Department department;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Regions regions;

    public Employee(String firstname, String lastname, String email, LocalDate hireDate, Gender gender, BigDecimal salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }

}
