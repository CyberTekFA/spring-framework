package com.hypertek.bootstrap;

import com.hypertek.entity.Region;
import com.hypertek.repository.CourseRepository;
import com.hypertek.repository.DepartmentRepository;
import com.hypertek.repository.EmployeeRepository;
import com.hypertek.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository ;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository,DepartmentRepository departmentRepository, EmployeeRepository employeeRepository,CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Region> countries = regionRepository.findByCountry("Canada");


        System.out.println("---------Region------------");
        System.out.println(countries);

        System.out.println("--------Distinct--------");

        System.out.println(regionRepository.findDistinctByCountry("Canada"));

        System.out.println("--------containing----------");

        System.out.println(regionRepository.findByCountryContaining("United"));

        System.out.println("----------order by");

        System.out.println(regionRepository.findByCountryContainingOrderByRegion("Asia"));

        System.out.println("---------top 2 -----------");

        System.out.println(regionRepository.findTopByCountry("United States"));

        System.out.println("--------department");

        System.out.println(departmentRepository.findByDepartment("Toys"));

        System.out.println("--------division-------");

        System.out.println(departmentRepository.findByDivisionIs("Outdoors"));

        System.out.println("--------department Division Contains--------");

        System.out.println(departmentRepository.findDistinctTop3ByDivisionContains("Hea"));


        System.out.println("--------by employee email--------");

        System.out.println(employeeRepository.findByEmail("bmanueau0@dion.ne.jp"));

        System.out.println(employeeRepository.findBySalaryGreaterThanOrderBySalaryDesc(230000));

        System.out.println(employeeRepository.findByEmailIsNull());

        System.out.println("--------JPQL--------");
        System.out.println(employeeRepository.getEmployee("bmanueau0@dion.ne.jp"));
        System.out.println(employeeRepository.getEmployeeSalary());

        System.out.println(employeeRepository.getEmployeeDetail("bmanueau0@dion.ne.jp",154864));

        System.out.println("------------------Course---------------------");

        courseRepository.findCourseByCategoryOrderByName("Spring").forEach(System.out::println);

        System.out.println(courseRepository.countCourseByCategory("Spring"));

        System.out.println(employeeRepository.getEmployeesDetails(154864));
    }
}
