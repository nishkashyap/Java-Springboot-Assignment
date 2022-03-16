package com.example.Assignment1;

import com.example.Assignment1.data.models.Employee;
import com.example.Assignment1.data.payload.EmployeeRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface EmployeeService {
    String createEmployee(EmployeeRequest empReq);
    Optional<Employee> getEmployee(Integer employeeId);
    List<Employee> getAllEmployees();
    Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
    void deleteEmployee(Integer employeeId);
}
