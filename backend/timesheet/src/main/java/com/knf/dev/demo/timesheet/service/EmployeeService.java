/*
package com.knf.dev.demo.timesheet.service;

import com.knf.dev.demo.timesheet.entity.Employee;
import com.knf.dev.demo.timesheet.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    };

    public Employee createEmployee(String firstname,String lastname){
        return employeeRepository.save((new Employee(firstname,lastname)));
    };

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
*/
