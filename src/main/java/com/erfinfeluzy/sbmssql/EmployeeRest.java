package com.erfinfeluzy.sbmssql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeRest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/home")
	public String home() {
		return "hello";
    }
    
    @GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
    }
    
    @PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
}
