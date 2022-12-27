package com.praveen.sample.service;

import java.util.List;

import com.praveen.sample.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long employeeId);
    void deleteEmployee(Long employeeId);
}
