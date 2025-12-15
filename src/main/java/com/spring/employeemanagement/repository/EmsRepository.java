package com.spring.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.employeemanagement.entity.Employee;

public interface EmsRepository extends JpaRepository<Employee, Integer>{

}
