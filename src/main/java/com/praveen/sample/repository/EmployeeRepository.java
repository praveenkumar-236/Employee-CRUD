package com.praveen.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.praveen.sample.entity.Employee;

@Repository
public interface EmployeeRepository extends   CrudRepository <Employee,Long>{
}
