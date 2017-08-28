package com.sergii.shutyi.model.enums;

import com.sergii.shutyi.model.entity.company.Company;
import com.sergii.shutyi.model.entity.employee.IEmployee;

import java.util.List;

public enum Department {
    ACCAUNTANT("accountant"), DELIVERY("delivery"), PRODUCTION("production");

    private String name;

    private Company company;

    private List<IEmployee> employeeList;

    Department(String name) {
        this.name = name;
    }

    Department(String name, Company company, List<IEmployee> employeeList) {
        this.name = name;
        this.company = company;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<IEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
