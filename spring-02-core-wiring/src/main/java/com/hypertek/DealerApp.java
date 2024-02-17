package com.hypertek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCar.class);
       Car car = context.getBean(Car.class);
       Person person = context.getBean(Person.class);
        System.out.println("Car class "+car.getMake());
        System.out.println("person "+person.getCar());
    }
}
