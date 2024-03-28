package com.hypertek.repository;

import com.hypertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    List<Department> findByDepartment(String department);

    List<Department> findByDivisionIs(String division);

    List<Department> findDistinctTop3ByDivisionContains(String pattern);
}
