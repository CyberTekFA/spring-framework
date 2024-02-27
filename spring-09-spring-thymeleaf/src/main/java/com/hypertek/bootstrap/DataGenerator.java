package com.hypertek.bootstrap;

import com.hypertek.model.Student;
import net.datafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Student> createStudent(){
        Faker faker =  new Faker();
        List<Student> students = Arrays.asList(
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,44),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,44),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,44),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,44),faker.address().state())
        );
        return students;
    }
}
