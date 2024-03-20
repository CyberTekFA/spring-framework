package com.hypertek.bootstraps;

import com.hypertek.entity.Department;
import com.hypertek.entity.Employee;
import com.hypertek.enums.Gender;
import com.hypertek.repository.DepartmentRepository;
import com.hypertek.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;


    public DataGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee emp1 = new Employee("Berrie","Smith","Berrie@gmail.com", LocalDate.of(2006, 4,20), Gender.MALE,new BigDecimal(234543));
        Employee emp2 = new Employee("Symosed","Sydney","Sydney@gmail.com", LocalDate.of(2010, 3,20), Gender.FEMALE,new BigDecimal(432434));
        Employee emp3 = new Employee("Felikes","McNea","McNea@gmail.com", LocalDate.of(2000, 1,20), Gender.MALE,new BigDecimal(3423423));
        Department d1 = new Department("Sport","OutDoor");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Phone & Tablets","Electric");
        emp1.setDepartment(d1);
        emp2.setDepartment(d2);
        emp3.setDepartment(d3);
        List<Employee>employees = Arrays.asList(emp1,emp2,emp3);

        employeeRepository.saveAll(employees);

    }
}
