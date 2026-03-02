package com.vw.EmployeeProject.repository;

import com.vw.EmployeeProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}