package com.vineet.employeecrud.service;

import com.vineet.employeecrud.entity.Employee;
import com.vineet.employeecrud.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existing.setName(employee.getName());
        existing.setDepartment(employee.getDepartment());

        return repository.save(existing);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}