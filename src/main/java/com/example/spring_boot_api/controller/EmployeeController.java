package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.entity.Employee;
import com.example.spring_boot_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getById(id);
    }

    @PutMapping("/employee/{id}")
    public Employee putEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
        return employeeService.update(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteById(id);
    }
}
