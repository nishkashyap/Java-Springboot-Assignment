package com.example.Assignment1.controller;

import com.example.Assignment1.Service.EmployeeService;
import com.example.Assignment1.data.models.Employee;
import com.example.Assignment1.data.payload.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/showAll")
    public ResponseEntity<List<Employee>> getAllEmployees () {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Integer id) {
        Optional<Employee> employee = employeeService.getEmployee(id);
        return new ResponseEntity(employee, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee( @RequestBody EmployeeRequest employee) {
        String newEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEmployee( @PathVariable Integer id, @RequestBody EmployeeRequest employee) {
        Optional<Employee> updateEmployee = employeeService.updateEmployee(id, employee);
        return new ResponseEntity(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
