package com.gudi.employeemanagement.service;

import java.util.List;

import com.gudi.employeemanagement.model.Employee;

public interface EmployeeService {

    List<Employee>getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    
}
