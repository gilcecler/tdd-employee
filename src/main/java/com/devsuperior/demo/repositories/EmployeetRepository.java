package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeetRepository extends JpaRepository<Employee, Long> {
}
