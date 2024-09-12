package com.knf.dev.demo.timesheet.controller;

import com.knf.dev.demo.timesheet.entity.Employee;
import com.knf.dev.demo.timesheet.service.EmployeeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    };

    @PostMapping("/create")
    public Employee createEmployee(@RequestParam String firstname,@RequestParam String lastname){
        log.info("Request reached to controller");
        Employee employee =  employeeService.createEmployee(firstname,lastname);
        log.info("Created Employee with firstname:"+employee.getFirstname()+" and lastname: "+employee.getLastname());
        return employee;
    }

    @GetMapping("/findAll")
    public List<Employee> getEmployess(){
        log.info("Request reached to find all controller");
        return employeeService.findAll();
    }

}
