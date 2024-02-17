package com.hypertek;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Selenium {
    private final OfficeHours officeHours;
    public void getTeachingHrs(){
        System.out.println("Teaching Hours: $"+(15 +officeHours.getHours()));
    }
}
