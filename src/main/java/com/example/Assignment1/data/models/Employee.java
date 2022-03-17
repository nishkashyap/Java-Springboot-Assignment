package com.example.Assignment1.data.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String empName;
    private String empBand;
    private String designation;
    private String email;
    private String phNo;

    public Employee() {
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpBand() {
        return empBand;
    }

    public void setEmpBand(String empBand) {
        this.empBand = empBand;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empBand='" + empBand + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", phNo='" + phNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empBand, employee.empBand) && Objects.equals(designation, employee.designation) && Objects.equals(email, employee.email) && Objects.equals(phNo, employee.phNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empBand, designation, email, phNo);
    }
}
