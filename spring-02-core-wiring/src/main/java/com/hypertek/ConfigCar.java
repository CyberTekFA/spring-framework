package com.hypertek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car() {
        Car car = new Car();
        car.setMake("Honda");
        return car;
    }
    // direct wiring
//    @Bean
//    Person person() {
//        Person person = new Person();
//        person.setName("John");
//        person.setCar(car());
//        return person;
//    }
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setCar(car);
        p.setName("John");
        return p;
    }
}
