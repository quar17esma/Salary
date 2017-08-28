package com.sergii.shutyi.model.entity.employee;

import com.sergii.shutyi.model.entity.company.Company;
import com.sergii.shutyi.model.enums.Department;

import java.time.LocalDate;
import java.util.List;

public class Manager implements IEmployee {
    private Employee employee;

    private List<IEmployee> employeeList;

    public Manager() {
    }

    public Manager(Employee employee, List<IEmployee> employeeList) {
        this.employee = employee;
        this.employeeList = employeeList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<IEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<IEmployee> employeeList) {
        this.employeeList = employeeList;
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
