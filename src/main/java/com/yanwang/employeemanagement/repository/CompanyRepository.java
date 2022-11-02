package com.yanwang.employeemanagement.repository;

import com.yanwang.employeemanagement.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean
}
