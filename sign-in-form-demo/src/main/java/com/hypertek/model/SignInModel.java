package com.hypertek.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInModel {
    private String firstname;
    private String lastname;
    private String city;
    private String stats;
    private int zipCode;
    private boolean remember;
}
