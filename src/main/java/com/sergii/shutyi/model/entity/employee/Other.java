package com.sergii.shutyi.model.entity.employee;

import com.sergii.shutyi.model.entity.company.Company;
import com.sergii.shutyi.model.enums.Department;

import java.time.LocalDate;

public class Other implements IEmployee {

    private Employee employee;

    private String description;

    public Other() {
    }

    public Other(Employee employee, String description) {
        this.employee = employee;
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getFio() {
        return employee.getFio();
    }

    @Override
    public LocalDate getBirthday() {
        return employee.getBirthday();
    }

    @Override
    public LocalDate getHiredDate() {
        return employee.getHiredDate();
    }

    @Override
    public Long getSalaryBase() {
        return employee.getSalaryBase();
    }

    @Override
    public void setSalary(Long salary) {
        employee.setSalary(salary);
    }

    @Override
    public Long getSalary() {
        return employee.getSalary();
    }

    @Override
    public Company getCompany() {
        return employee.getCompany();
    }

    @Override
    public Department getDepartment() {
        return employee.getDepartment();
    }
}
