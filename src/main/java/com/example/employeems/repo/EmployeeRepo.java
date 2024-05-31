package com.example.employeems.repo;

import com.example.employeems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public class EmployeeRepo extends JpaRepository<Employee,Integer> {
}
