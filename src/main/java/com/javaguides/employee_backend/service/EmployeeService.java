package com.javaguides.employee_backend.service;


import com.javaguides.employee_backend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> readEmployees();
}
