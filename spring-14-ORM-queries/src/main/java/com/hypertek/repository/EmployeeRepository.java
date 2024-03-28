package com.hypertek.repository;

import com.hypertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByEmail(String email);
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname,String lastname, String email);
    List<Employee> findByLastNameStartsWith(String lastname);

    List<Employee> findBySalaryGreaterThan(Integer salary);

    List<Employee> findBySalaryLessThan(Integer salary);

    List<Employee> findBySalaryGreaterThanOrderBySalaryDesc(Integer salary);

    List<Employee> findByEmailIsNull();

    @Query("select e from Employee  e where e.email = ?1")
    Employee getEmployee(String email);
    @Query("select e.salary from Employee  e where  e.email= 'bmanueau0@dion.ne.jp'")
    Integer getEmployeeSalary();
    @Query("select e from Employee  e where e.email=?1 and e.salary=?2")
    Employee getEmployeeDetail(String email, int salary);

    @Query(value = "select * from employees  where salary > ?1",nativeQuery = true)
    List<Employee> getEmployeesDetails(int salary);

}
