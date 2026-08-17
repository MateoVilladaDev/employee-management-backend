package com.javaguides.employee_backend.service;

import com.javaguides.employee_backend.model.Employee;
import com.javaguides.employee_backend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
