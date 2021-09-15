package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee save(Employee employee);
    public List<Employee> getAll();
    public Employee getById(Long id);
    public Employee update(Long id, Employee employee);
    public void deleteById(Long id);
}
