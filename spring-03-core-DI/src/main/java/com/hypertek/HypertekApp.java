package com.hypertek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HypertekApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        var selenium = context.getBean(Selenium.class);
        var java = context.getBean(Java.class);
        selenium.getTeachingHrs();
        java.JavaCourse();

    }
}
