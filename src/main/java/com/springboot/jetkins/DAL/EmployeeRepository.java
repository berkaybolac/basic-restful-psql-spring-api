package com.springboot.jetkins.DAL;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.jetkins.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
