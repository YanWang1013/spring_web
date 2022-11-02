package com.yanwang.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yanwang.employeemanagement.domain.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean
    @Query("SELECT b.companyName, COUNT(a.id) AS cnt FROM Employee AS a LEFT JOIN a.company AS b GROUP BY a.company")
    List<Object[]> getNumberOfEmployee();
}
