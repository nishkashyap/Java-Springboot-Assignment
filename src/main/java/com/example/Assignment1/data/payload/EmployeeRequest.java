package com.example.Assignment1.data.payload;

import com.example.Assignment1.data.models.EmpBand;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmployeeRequest {

    @NotBlank
    @NotNull
    private String empName;
    @NotBlank
    @NotNull
    private String empBand;
    @NotBlank
    @NotNull
    private String designation;
    @NotBlank
    @NotNull
    private String email;
    @NotBlank
    @NotNull
    private String phNo;

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
}
