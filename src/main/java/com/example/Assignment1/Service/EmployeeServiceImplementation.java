package com.example.Assignment1.Service;

import com.example.Assignment1.Repository.EmployeeRepository;
import com.example.Assignment1.data.models.Employee;
import com.example.Assignment1.data.payload.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    @Override
    public String createEmployee(EmployeeRequest employeeRequest) {
        Employee newEmployee = new Employee();
        newEmployee.setEmpName(employeeRequest.getEmpName());
        newEmployee.setEmpBand(employeeRequest.getEmpBand());
        newEmployee.setDesignation(employeeRequest.getDesignation());
        newEmployee.setEmail(employeeRequest.getEmail());
        newEmployee.setPhNo(employeeRequest.getPhNo());
        empRepo.save(newEmployee);
        return "New Employee created successfully";

    }

    @Override
    public Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest){
        Optional<Employee> employee = empRepo.findById(employeeId);
        employee.get().setEmpName(employeeRequest.getEmpName());
        employee.get().setEmpBand(employeeRequest.getEmpBand());
        employee.get().setDesignation(employeeRequest.getDesignation());
        employee.get().setEmail(employeeRequest.getEmail());
        employee.get().setPhNo(employeeRequest.getPhNo());
        empRepo.save(employee.get());
        return employee;
    }

    @Override
    public Optional<Employee> getEmployee(Integer employeeId){
        return empRepo.findById(employeeId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }
    @Override
    public void deleteEmployee(Integer employeeId){
        if (empRepo.getById(employeeId).getEmpId() == employeeId) {
            empRepo.deleteById(employeeId);
        }
    }
}
