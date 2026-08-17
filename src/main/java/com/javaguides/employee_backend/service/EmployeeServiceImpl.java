package com.javaguides.employee_backend.service;

import com.javaguides.employee_backend.model.Employee;
import com.javaguides.employee_backend.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> readEmployees(){
        return employeeRepository.findAll();
    }
}
