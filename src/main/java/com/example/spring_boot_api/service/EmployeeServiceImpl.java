package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Employee;
import com.example.spring_boot_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee update(Long id, Employee employee) {
        Employee employee1 = employeeRepository.findById(id).get();
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());
        return employee1;
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
